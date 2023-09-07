package com.stackroute.ServiceProviderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.ServiceProviderService.model.ServiceProvider;
import com.stackroute.ServiceProviderService.repo.ServiceProviderRepository;






@Service
public class ServiceProviderServ {
	
	@Autowired
	ServiceProviderRepository providerRepo;

    public Iterable<ServiceProvider> getProvider() {
     return providerRepo.findAll();
    }

    public ServiceProvider insertProvider(ServiceProvider provider) {
        return providerRepo.save(provider);
    }
    public ServiceProvider updateProduct(ServiceProvider provider, String email) {
        ServiceProvider serviceProvider  = providerRepo.findById(email).get();
        serviceProvider.setPassword(provider.getPassword());
        serviceProvider.setConfirmpassword(provider.getConfirmpassword());
        serviceProvider.setAddress(provider.getAddress());
        serviceProvider.setCountry(provider.getCountry());
        serviceProvider.setContactnumber(provider.getContactnumber());
        serviceProvider.setServiceType(provider.getServiceType());
        serviceProvider.setShopname(provider.getShopname());
        serviceProvider.setShopownername(provider.getShopownername());
        return serviceProvider;
    }
    public List<ServiceProvider> findByShopname(String shopname) {
        return ServiceProviderRepo.findByShopname(shopname);
    }
    public List<ServiceProvider> findByShopownername(String shopownername) {
        return ServiceProviderRepo.findByShopownername(shopownername);
    }
    public List<ServiceProvider> findByAddress(String address) {
        return ServiceProviderRepo.findByShopownername(address);
    }
    public List<ServiceProvider> findByserviceType(String serviceType) {
        return ServiceProviderRepo.findByserviceType(serviceType);
    }
    public List<ServiceProvider> findByShopnameAndserviceType(String shopname, String serviceType) {
        return ServiceProviderRepo.findByShopnameAndserviceType(shopname, serviceType);
    }
    public List<ServiceProvider> findByShopownernameAndserviceType(String shopownername, String serviceType) {
        return ServiceProviderRepo.findByShopownernameAndserviceType(shopownername, serviceType);
    }
    public List<ServiceProvider> findByAddressAndserviceType(String address, String serviceType) {
        return ServiceProviderRepo.findByAddressAndserviceType(address, serviceType);
    }
    public List<ServiceProvider> findByShopnameAndAddress(String shopname, String address) {
        return ServiceProviderRepo.findByShopnameAndAddress(shopname, address);
    }
    public List<ServiceProvider> findByShopownernameAndShopname(String shopownername, String shopname) {
        return ServiceProviderRepo.findByShopownernameAndShopname(shopownername, shopname);
    }
    public List<ServiceProvider> findByShopownernameAndShopnameAndAddress(String shopownername, String shopname, String address) {
        return ServiceProviderRepo.findByShopownernameAndShopnameAndAddress(shopownername, shopname, address);
    }
    public List<ServiceProvider> findByShopownernameAndShopnameAndServiceType(String shopownername, String shopname, String serviceType) {
        return ServiceProviderRepo.findByAddressAndserviceTypeAndServiceType(shopownername, shopname, serviceType);
    }
    public List<ServiceProvider> findByAddressAndShopnameAndServiceType(String address, String shopname, String serviceType) {
        return ServiceProviderRepo.findByAddressAndShopnameAndserviceType(address, shopname, serviceType);
    }
    public List<ServiceProvider> findByAddressAndShopownernameAndServiceType(String address, String shopownername, String serviceType) {
      
    	return ServiceProviderRepo.findByAddressAndShopownernameAndAddress(address, shopownername, serviceType);
    }
    public List<ServiceProvider> findByShopnameAndAddressAndShopownernameAndServiceType(String shopname, String address, String shopownername, String serviceType) {
        return ServiceProviderRepo.findByShopnameAndAddressAndShopownernameAndServiceType(shopname, address, shopownername,  serviceType);
    }

}
