package id.edijun.springbootbaseservice.module.customer.service;

import java.util.List;

import id.edijun.springbootbaseservice.module.customer.controller.payload.CustomerGetAllResponse;


public interface CustomerService {
	List<CustomerGetAllResponse> getAll();
}