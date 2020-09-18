package id.edijun.springbootbaseservice.application.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

public class Mapper {

	public static Object parse(Object responseObject, String response) {
		ObjectMapper mapper = new ObjectMapper();
		Object result = null;
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		if (response != null && !response.isEmpty()) {
			try {
				result = mapper.readValue(response, responseObject.getClass());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public static <T> T parse(Class<T> clazz, String response) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		if (response != null && !response.isEmpty()) {
			try {
				return mapper.readValue(response, clazz);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static String toString(Object object) {
		String result = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			result = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static <T> T toObject(Class<T> clazz, Object object) {
		if (object != null) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			return mapper.convertValue(object, clazz);
		}
		return null;
	}

	public static <T> T parseTypeRef(TypeReference<T> typeRef, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		mapper.registerModule(new JavaTimeModule());
		return mapper.convertValue(object, typeRef);
	}
}
