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
        provider1.setAddress(provider.getAddress());
        provider1.setContactnumber(provider.getContactnumber());
        provider1.setServiceProduct(provider.getServiceProduct());
        provider1.setProductBrand(provider.getProductBrand());
        provider1.setProfilePic(provider.getProfilePic());
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
    public SearchResponse<Provider> matchProvidersWithaddress(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithaddress(email);
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }

    public SearchResponse<Provider> matchProvidersWithserviceProduct(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithserviceProduct(email);
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }

    public SearchResponse<Provider> matchProvidersWithproductBrand(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithproductBrand(email);
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }

    public SearchResponse<Provider> matchProvidersWithshopname(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithshopname(email);
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
        System.out.println("elasticsearch query is "+supplier.get().toString());
        return searchResponse;
    }
    public SearchResponse<Provider> matchProvidersWithshopownername(String email) throws IOException {
        Supplier<Query> supplier  = ProviderUtil.supplierWithshopownername(email);
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
     
     
     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownername(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndshopownerName(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopnameAndserviceProduct(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndserviceProduct(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopnameAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndproductBrand(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopnameAndaddress(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndaddress(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopnameAndcontactnumber(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndcontactnumber(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     
     public SearchResponse<Provider> matchProvidersWithshopnameAndemail(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopnameAndemail(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopownernameserviceProduct(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopownernameserviceProduct(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopownernameproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopownernameAndproductBrand(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopownernameaddress(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopownernameaddress(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopownernamecontactnumber(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopownernamecontactnumber(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithshopshopownernameemail(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithshopownernameemail(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithproductBrandAndaddress(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithproductBrandAndaddress(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithserviceProductAndaddress(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithserviceProductAndaddress(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithserviceProductAndcontactnumber(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithserviceProductAndcontactnumber(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithproductBrandAndcontactnumber(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithproductBrandAndcontactnumber(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     
     public SearchResponse<Provider> matchProvidersWithserviceProductAndemail(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithserviceProductAndemail(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     
     public SearchResponse<Provider> matchProvidersWithproductBrandAndemail(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithproductBrandAndemail(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     
     public SearchResponse<Provider> matchProvidersWithserviceProductAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithserviceProductAndproductBrand(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithaddressAndcontactnumber(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithaddressAndcontactnumber(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     public SearchResponse<Provider> matchProvidersWithaddressAndemail(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplierWithaddressAndemail(query);
         SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.index("providers").query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;}
     

     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndaddress(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }
   


     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndserviceProduct(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }


     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopnameAndaddressAndserviceProduct(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopnameAndaddressAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopnameAndserviceProductAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopownernameAndaddressAndserviceProduct(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopownernameAndaddressAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithshopownernameAndserviceProductAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }

     public SearchResponse<Provider> matchProvidersWithaddressAndserviceProductAndproductBrand(String query) throws IOException {
         Supplier<Query> supplier  = ProviderUtil.supplier();
        SearchResponse<Provider> searchResponse = elasticsearchClient.search(s->s.query(supplier.get()),Provider.class);
         System.out.println("elasticsearch query is "+supplier.get().toString());
         return searchResponse;
     }
     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndaddressAndserviceProduct(String query) throws IOException {
    	    Supplier<Query> supplier = ProviderUtil.supplier();
    	    SearchResponse<Provider> searchResponse = elasticsearchClient.search(s -> s.query(supplier.get()), Provider.class);
    	    System.out.println("elasticsearch query is " + supplier.get().toString());
    	    return searchResponse;
    	}
     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndaddressAndproductBrand(String query) throws IOException {
    	    Supplier<Query> supplier = ProviderUtil.supplier();
    	    SearchResponse<Provider> searchResponse = elasticsearchClient.search(s -> s.query(supplier.get()), Provider.class);
    	    System.out.println("elasticsearch query is " + supplier.get().toString());
    	    return searchResponse;
    	}
     public SearchResponse<Provider> matchProvidersWithshopnameAndshopownernameAndserviceProductAndproductBrand(String query) throws IOException {
    	    Supplier<Query> supplier = ProviderUtil.supplier();
    	    SearchResponse<Provider> searchResponse = elasticsearchClient.search(s -> s.query(supplier.get()), Provider.class);
    	    System.out.println("elasticsearch query is " + supplier.get().toString());
    	    return searchResponse;
    	}
     public SearchResponse<Provider> matchProvidersWithshopnameAndaddressAndserviceProductAndproductBrand(String query) throws IOException {
    	    Supplier<Query> supplier = ProviderUtil.supplier();
    	    SearchResponse<Provider> searchResponse = elasticsearchClient.search(s -> s.query(supplier.get()), Provider.class);
    	    System.out.println("elasticsearch query is " + supplier.get().toString());
    	    return searchResponse;
    	}

     public SearchResponse<Provider> matchProvidersWithshopownernameAndaddressAndserviceProductAndproductBrand(String query) throws IOException {
    	    Supplier<Query> supplier = ProviderUtil.supplier();
    	    SearchResponse<Provider> searchResponse = elasticsearchClient.search(s -> s.query(supplier.get()), Provider.class);
    	    System.out.println("elasticsearch query is " + supplier.get().toString());
    	    return searchResponse;
    	}



   
}
