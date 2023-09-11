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

import com.example.springbootelasticsearchexample.entity.Provider;
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
    public Provider insertProduct(@RequestBody  Provider provider){
       return providerService.insertProvider(provider);
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
    @GetMapping("/matchProvidersWithshopnameAndshopownername")
    public List<Provider> matchProvidersWithshopnameAndshopownername(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndshopownername(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithshopnameAndserviceProduct")
    public List<Provider> matchProvidersWithshopnameAndserviceProduct(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndserviceProduct(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchProvidersWithshopnameAndproductBrand")
    public List<Provider> matchProvidersWithshopnameAndproductBrand(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndproductBrand(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchProvidersWithshopnameAndaddress")
    public List<Provider> matchProvidersWithshopnameAndaddress(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndaddress(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithshopnameAndcontactnumber")
    public List<Provider> matchProvidersWithshopnameAndcontactnumber(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndcontactnumber(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithshopnameAndemail")
    public List<Provider> matchProvidersWithshopnameAndemail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopnameAndemail(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchProvidersWithshopownernameserviceProduct")
    public List<Provider> matchProvidersWithshopownernameserviceProduct(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopownernameserviceProduct(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }
    @GetMapping("/matchProvidersWithshopownernameproductBrand")
    public List<Provider> matchProvidersWithshopownernameproductBrand(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopownernameproductBrand(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }



    @GetMapping("/matchProvidersWithshopownernamecontactnumber")
    public List<Provider> matchProvidersWithshopownernameaddress(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopownernamecontactnumber(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }


    @GetMapping("/matchProvidersWithshopshopownernameemail")
    public List<Provider> matchProvidersWithshopshopownernameemail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithshopshopownernameemail(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithproductBrandAndaddress")
    public List<Provider> matchProvidersWithproductBrandAndaddress(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithproductBrandAndaddress(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }


    @GetMapping("/matchProvidersWithserviceProductAndaddress")
    public List<Provider> matchProvidersWithserviceProductAndaddress(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithserviceProductAndaddress(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }


    @GetMapping("/matchProvidersWithserviceProductAndcontactnumber")
    public List<Provider> matchProvidersWithserviceProductAndcontactnumber(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithserviceProductAndcontactnumber(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithproductBrandAndcontactnumber")
    public List<Provider> matchProvidersWithproductBrandAndcontactnumber(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithproductBrandAndcontactnumber(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithproductBrandAndemail")
    public List<Provider> matchProvidersWithproductBrandAndemail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithproductBrandAndemail(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }


    @GetMapping("/matchProvidersWithserviceProductAndemail")
    public List<Provider> matchProvidersWithserviceProductAndemail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithserviceProductAndemail(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithserviceProductAndproductBrand")
    public List<Provider> matchProvidersWithserviceProductAndproductBrand(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithserviceProductAndproductBrand(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }



    @GetMapping("/matchProvidersWithaddressAndcontactnumber")
    public List<Provider> matchProvidersWithaddressAndcontactnumber(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithaddressAndcontactnumber(email);
        System.out.println(searchResponse.hits().hits().toString());

        List<Hit<Provider>> listOfHits= searchResponse.hits().hits();
        List<Provider> listOfProviders  = new ArrayList<>();
        for(Hit<Provider> hit : listOfHits){
            listOfProviders.add(hit.source());
        }
        return listOfProviders;
    }

    @GetMapping("/matchProvidersWithaddressAndemail")
    public List<Provider> matchProvidersWithaddressAndemail(@RequestParam String email) throws IOException {
        SearchResponse<Provider> searchResponse =  providerService.matchProvidersWithaddressAndemail(email);
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
