package id.edijun.springbootbaseservice.application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "code", "message" })
public class BaseResponse {

	@JsonProperty("code")
	protected String code;

	@JsonProperty("message")
	protected String message;
}
