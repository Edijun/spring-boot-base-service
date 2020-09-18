package id.edijun.springbootbaseservice.module.customer;

import java.util.List;

import id.edijun.springbootbaseservice.module.customer.payload.CustomerGetAllResponse;

interface CustomerService {
	List<CustomerGetAllResponse> getAll();
}