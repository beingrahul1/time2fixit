package com.stackroute.ServiceProviderService.repo;



import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.stackroute.ServiceProviderService.model.Provider;

public interface ProviderRepo extends ElasticsearchRepository<Provider, String>{
	

	Optional<Provider> findByEmail(String email);
	
        }
