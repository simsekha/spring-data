package com.tutorials.simsek.jpatutorial.command;

import com.tutorials.simsek.jpatutorial.dto.BaseRequest;
import com.tutorials.simsek.jpatutorial.dto.BaseResponse;

public abstract class BaseCommand<T extends BaseRequest, V extends BaseResponse> {
	public abstract V perform(T req);

	public abstract V validate(T req);
}
