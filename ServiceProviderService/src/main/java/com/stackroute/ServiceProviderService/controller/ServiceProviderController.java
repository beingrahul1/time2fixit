package com.stackroute.ServiceProviderService.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.model.Author;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.ServiceProviderService.model.ServiceProvider;
import com.stackroute.ServiceProviderService.service.ServiceProviderServ;

@RestController
@RequestMapping("/apis")
public class ServiceProviderController {
	  @Autowired
	    private ElasticsearchRestTemplate elasticsearchRestTemplate;

  @Autowired
  private ServiceProviderServ  providerService;
  @GetMapping("/findAll")
  Iterable<ServiceProvider> getServiceProvide(){
     return providerService.findAll();

  }
 ServiceProvider serviceprovider;
	
  @RabbitListener(queues = "cgiqueue1")
  public void receiveData(ServiceProvider serviceprovider) {
  
   
          this.serviceprovider = serviceprovider;
          providerService.insertProvider(this.serviceprovider);


      
  }


  @PostMapping("/insert")
  public ServiceProvider insertprovider(@RequestBody  ServiceProvider ServiceProvider){
     return providerService.insertProvider(ServiceProvider);
  }
  
  @GetMapping("/findshopname")
  public List<ServiceProvider>findByShopname(@RequestParam String shopname){
     return providerService.findByShopname(shopname);

  }
  @GetMapping("/findshopownername")
  public List<ServiceProvider>findByShopownername(@RequestParam String shopownername){
     return providerService.findByShopownername(shopownername);

  }
  @GetMapping("/findaddress")
  public List<ServiceProvider>findByAddress(@RequestParam String address){
     return providerService.findByAddress(address);

  }
  
  @GetMapping("/findserviceType")
  public List<ServiceProvider>findByserviceType(@RequestParam String serviceType){
     return providerService.findByserviceType(serviceType);

  }
  @GetMapping("/find/shopname/serviceType")
  public List<ServiceProvider>findByShopnameAndserviceType(@RequestParam String shopname, @RequestParam String serviceType){
     return providerService.findByShopnameAndserviceType(shopname, serviceType);

  }
  
  @GetMapping("/find/shopownername/serviceType")
  public List<ServiceProvider>findByShopownernameAndserviceType(@RequestParam String shopownername, @RequestParam String serviceType){
     return providerService.findByShopownernameAndserviceType(shopownername, serviceType);

  }

  
  @GetMapping("/find/shopname/address")
  public List<ServiceProvider>findByShopnameAndAddress(@RequestParam String shopname, @RequestParam String address){
     return providerService.findByShopnameAndAddress(address, address);

  }
  @GetMapping("/find/address/serviceType")
  public List<ServiceProvider>findByAddressAndserviceType(@RequestParam String address, @RequestParam String serviceType){
     return providerService.findByAddressAndserviceType(address, serviceType);

  }
  @GetMapping("/find/shopownername/shopname/address")
  public List<ServiceProvider>findByShopownernameAndShopnameAndAddress(@RequestParam String shopownername, @RequestParam String shopname, @RequestParam String address) {
     return providerService.findByShopownernameAndShopnameAndAddress(shopownername, shopname, address);

  }
  
  @GetMapping("/find/shopownername/shopname/serviceType")
  public List<ServiceProvider>findByShopownernameAndShopnameAndServiceType(@RequestParam String shopownername, @RequestParam String shopname, @RequestParam String serviceType) {
     return providerService.findByShopownernameAndShopnameAndServiceType(shopownername, shopname, serviceType);
  }

  
  @GetMapping("/find/shopownername/shopname")
  public List<ServiceProvider>findByShopownernameAndShopname(@RequestParam String shopownername, @RequestParam String shopname){
     return providerService.findByShopownernameAndShopname(shopownername, shopname);

  }
  @GetMapping("/find/address/shopname/serviceType")
  public List<ServiceProvider>findByAddressAndShopnameAndServiceType(@RequestParam String address,@RequestParam String shopname,@RequestParam String serviceType) {
     return providerService.findByAddressAndShopnameAndServiceType(address, shopname, serviceType) ;

  }
  @GetMapping("/find/shopname/address/shopownername/serviceType")
  public List<ServiceProvider> findByShopnameAndAddressAndShopownernameAndServiceType(@RequestParam String shopname, @RequestParam String address, @RequestParam String shopownername, @RequestParam String serviceType)  {
     return providerService.findByShopnameAndAddressAndShopownernameAndServiceType(shopname, address, shopownername, serviceType);

  }
  @GetMapping("/find/address/shopownername/serviceType")
  public List<ServiceProvider>findByAddressAndShopownernameAndServiceType(@RequestParam String address, @RequestParam String shopownername, @RequestParam String serviceType) {
     return providerService.findByAddressAndShopownernameAndServiceType( address, shopownername, serviceType) ;

  }

}
