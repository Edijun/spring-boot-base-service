package id.edijun.springbootbaseservice.module.customer.payload;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerGetAllResponse {

	private Long id;
	private String salutation;

	@JsonProperty("full_name")
	@JsonAlias("fullName")
	private String fullName;

	@JsonProperty("birth_place")
	@JsonAlias("birthPlace")
	private String birthPlace;

	@JsonProperty("birth_date")
	@JsonAlias("birthDate")
	private Date birthDate;

}
