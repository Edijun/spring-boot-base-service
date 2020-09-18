package id.edijun.springbootbaseservice.application.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import id.edijun.springbootbaseservice.application.constant.AppStatus;

@JsonInclude(Include.NON_NULL)
public class SuccessResponse<T> extends BaseResponse {

	@JsonProperty("data")
	private T data;

	public SuccessResponse(T data) {
		super();
		code = AppStatus.SUCCESS.getCode();
		message = AppStatus.SUCCESS.getMessage();
		this.data = data;
	}

	public SuccessResponse(AppStatus status) {
		super();
		code = status.getCode();
		message = status.getMessage();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}