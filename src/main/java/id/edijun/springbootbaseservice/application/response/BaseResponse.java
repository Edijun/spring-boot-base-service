package id.edijun.springbootbaseservice.application.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import id.edijun.springbootbaseservice.application.constant.AppStatus;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "code", "message" })
public class BaseResponse<DATA> {

	@JsonProperty("code")
	protected String code;

	@JsonProperty("message")
	protected String message;

	private DATA data;

	public BaseResponse() {
		this.code = AppStatus.SUCCESS.getCode();
		this.message = AppStatus.SUCCESS.getMessage();
	}
	
	public BaseResponse(DATA data) {
		this.code = AppStatus.SUCCESS.getCode();
		this.message = AppStatus.SUCCESS.getMessage();
		this.data = data;
	}

	public BaseResponse(AppStatus status) {
		super();
		this.code = status.getCode();
		this.message = status.getMessage();
		this.data = null;
	}
}
