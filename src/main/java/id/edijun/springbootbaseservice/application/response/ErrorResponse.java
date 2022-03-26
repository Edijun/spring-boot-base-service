package id.edijun.springbootbaseservice.application.response;

import id.edijun.springbootbaseservice.application.constant.AppStatus;

public class ErrorResponse extends BaseResponse<Object> {

	public ErrorResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ErrorResponse(AppStatus appStatus) {
		super();
		this.code = appStatus.getCode();
		this.message = appStatus.getMessage();
	}

}
