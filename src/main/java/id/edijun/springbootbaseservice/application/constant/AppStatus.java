package id.edijun.springbootbaseservice.application.constant;

public enum AppStatus {

	SUCCESS("OK:SUCCESS", "Success"), 
	ERROR_VALIDATION("ERR:VALIDATION", "Error validation"),
	ERROR_UNAUTHORIZE("ERR:UNAUTHORIZED", "Error unauthorized"),
	ERROR_NOT_FOUND("ERR:NOT_FOUND", "Resource not found"),
	ERROR_INTERNAL("ERR:INTERNAL", "Internal server error");

	private final String code;

	private final String message;

	AppStatus(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
