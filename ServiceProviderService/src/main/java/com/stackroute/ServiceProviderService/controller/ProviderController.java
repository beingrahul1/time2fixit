package com.stackroute.ServiceProviderService.controller;


import com.stackroute.ServiceProviderService.service.ProviderService;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.stackroute.ServiceProviderService.model.*;

@RestController
@RequestMapping("/apis")
public class ProviderController {

    @Autowired
    private ProviderService  providerService;
    @GetMapping("/findAll")
    Iterable<Provider> findAll(){
       return providerService.getProviders();

    }

    @PostMapping("/insert")
    public Provider insertProduct(@RequestBody  Provider product){
       return providerService.insertProvider(product);
    }
    
    @GetMapping("/findEmail")
    public Optional<Provider> findByEmail(@RequestParam String email){
       return providerService.findByEmail(email);

    }

    @GetMapping("/matchAllProvidersWithEmail")
    public List<Provider> matchAllProvidersWithEmail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithEmail(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchAllProvidersAllFields")
    public List<Provider> matchAllProvidersAllFields(@RequestParam String query) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithAllFields(query);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchAll")
    public String matchAll() throws IOException {
        SearchResponse<Map> searchResponse =  providerService.matchAllServices();
        System.out.println(searchResponse.hits().hits().toString());
        return searchResponse.hits().hits().toString();
    }

    @GetMapping("/matchAllProviders")
    public List<Provider> matchAllProviders() throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchAllProvidersServices();
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProducts  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProducts.add(hit.source());
        }
        return listOfProducts;
    }

}
