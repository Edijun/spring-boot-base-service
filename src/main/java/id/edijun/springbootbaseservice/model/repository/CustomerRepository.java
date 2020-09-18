package id.edijun.springbootbaseservice.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import id.edijun.springbootbaseservice.model.entity.Customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
	
}
