package com.stackroute.ServiceProviderService.repo;

import com.stackroute.ServiceProviderService.model.Provider;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProviderRepo extends ElasticsearchRepository<Provider,Integer> {
	

	Optional<Provider> findByEmail(String email);
	
        }
