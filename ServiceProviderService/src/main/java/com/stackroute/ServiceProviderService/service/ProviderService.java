package com.stackroute.ServiceProviderService.service;
import com.stackroute.ServiceProviderService.model.Provider;
import com.stackroute.ServiceProviderService.repo.ProviderRepo;
import com.stackroute.ServiceProviderService.util.ProviderUtil;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.MultiMatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.SearchHitsIterator;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import java.util.function.Supplier;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private  ProviderRepo providerRepo;
   
    
    @Autowired
    private ElasticsearchClient  elasticsearchClient;
    

    public Iterable<Provider> getProviders() {
     return providerRepo.findAll();
    }

    public Provider insertProvider(Provider provider) {
        return providerRepo.save(provider);
    }

    public Provider updateProvider(Provider provider, String email) {
        Provider provider1  = providerRepo.findByEmail(email).get();
        provider1.setShopname(provider.getShopname());
        provider1.setShopownername(provider.getShopownername());
        provider1.setPassword(provider.getPassword());
        provider1.setConfirmpassword(provider.getConfirmpassword());
        provider1.setAddress(provider.getAddress());
        provider1.setContactnumber(provider.getContactnumber());
        provider1.setServiceType(provider.getServiceType());
        return providerRepo.save(provider1);
    }

  
    
    public Optional<Provider> findByEmail(String email) {
    	return providerRepo.findByEmail(email);
    }
    public SearchResponse<Provider> matchProvidersWithEmail(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithEmail(email);
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }
    public SearchResponse<Map> matchAllServices() throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplier();
       SearchResponse<Map> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Map.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }
  

    public SearchResponse<Provider> matchAllProvidersServices() throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }


 

     public SearchResponse<Provider> matchProvidersWithAllFields(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithAllFields(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}



   
}
