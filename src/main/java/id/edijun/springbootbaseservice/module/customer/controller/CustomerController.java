package id.edijun.springbootbaseservice.module.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import id.edijun.springbootbaseservice.application.response.BaseResponse;
import id.edijun.springbootbaseservice.module.customer.controller.payload.CustomerGetAllResponse;
import id.edijun.springbootbaseservice.module.customer.service.CustomerService;

@RestController
@RequestMapping("customer")
@ResponseStatus(HttpStatus.OK)
class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public BaseResponse<List<CustomerGetAllResponse>> getAll() {
		return customerService.getAll();
	}
}
