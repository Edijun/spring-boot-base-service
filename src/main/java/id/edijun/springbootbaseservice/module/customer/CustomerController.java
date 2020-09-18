package id.edijun.springbootbaseservice.module.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.edijun.springbootbaseservice.application.response.SuccessResponse;
import id.edijun.springbootbaseservice.module.customer.payload.CustomerGetAllResponse;

@RestController
@RequestMapping("customer")
class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	SuccessResponse<List<CustomerGetAllResponse>> getAll() {
		List<CustomerGetAllResponse> response = customerService.getAll();
		SuccessResponse<List<CustomerGetAllResponse>> successResponse = 
				new SuccessResponse<List<CustomerGetAllResponse>>(response);
		return successResponse;
	}
}
