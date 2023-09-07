package com.stackroute.ServiceProviderService.repo;



import java.util.List;
import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.stackroute.ServiceProviderService.model.ServiceProvider;



public interface ServiceProviderRepository extends ElasticsearchRepository<ServiceProvider,Integer> {

	Optional<ServiceProvider> findById(String email);



	List<ServiceProvider> findByShopname(String shopname);

	List<ServiceProvider> findByShopownername(String shopownername);

	List<ServiceProvider> findByserviceType(String serviceType);

	List<ServiceProvider> findByShopnameAndserviceType(String shopname, String serviceType);

	List<ServiceProvider> findByShopownernameAndserviceType(String shopownername, String serviceType);

	List<ServiceProvider> findByCountryAndserviceType(String Country, String serviceType);

  List<ServiceProvider> findByShopnameAndCountry(String shopname, String Country);

List<ServiceProvider> findByShopownernameAndShopname(String shopownername, String shopname);

List<ServiceProvider> findByShopownernameAndShopnameAndCountry(String shopownername, String shopname, String Country);

List<ServiceProvider> findByCountryAndShopnameAndserviceType(String Country, String shopname, String serviceType);

List<ServiceProvider> findByCountryAndserviceTypeAndServiceType(String shopownername, String shopname, String serviceType);

List<ServiceProvider> findByCountryAndShopownernameAndCountry(String Country, String shopownername, String serviceType);

List<ServiceProvider> findByShopnameAndCountryAndShopownernameAndServiceType( String  shopname, String Country, String shopownername,
		String serviceType);




        }




        }

