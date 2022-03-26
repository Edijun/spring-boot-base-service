package id.edijun.springbootbaseservice.module.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;

import id.edijun.springbootbaseservice.application.response.BaseResponse;
import id.edijun.springbootbaseservice.application.util.Mapper;
import id.edijun.springbootbaseservice.model.entity.Customer;
import id.edijun.springbootbaseservice.model.repository.CustomerRepository;
import id.edijun.springbootbaseservice.module.customer.controller.payload.CustomerGetAllResponse;

@Service
class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public BaseResponse<List<CustomerGetAllResponse>> getAll() {
		Iterable<Customer> allCustomer = customerRepository.findAll();
		TypeReference<List<CustomerGetAllResponse>> typeRef = 
				new TypeReference<List<CustomerGetAllResponse>>() {};
				
		// auto conversion from entity to dto using type reference
		List<CustomerGetAllResponse> response = Mapper.parseTypeRef(typeRef, allCustomer);
		return new BaseResponse<List<CustomerGetAllResponse>>(response);
	}
}
