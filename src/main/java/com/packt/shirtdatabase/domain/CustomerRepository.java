package com.packt.shirtdatabase.domain;


import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>{
	//fetch customer byId
	List<Customer> findByCustomerId(Long Id);
}