package com.packt.shirtdatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long > {

	List<Order> findById(long id);

	List<Customer> findByCustomerId(long id);


}
