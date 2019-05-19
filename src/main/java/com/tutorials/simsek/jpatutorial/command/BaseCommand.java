package com.tutorials.simsek.jpatutorial.command;

import org.springframework.core.convert.converter.*;
import com.tutorials.simsek.jpatutorial.dto.BaseRequest;
import com.tutorials.simsek.jpatutorial.dto.BaseResponse;

public abstract class BaseCommand<T extends BaseRequest, V extends BaseResponse, S> {
	private Converter<T, S> converter;

	public BaseCommand(Converter<T, S> converter) {
		this.converter = converter;
	}

	public abstract V perform(T req);

	public abstract V validateRequest(T req);

	protected S convert(T t) {
		return converter.convert(t);
	}
}
