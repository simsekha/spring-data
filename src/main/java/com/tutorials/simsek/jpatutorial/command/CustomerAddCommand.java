package com.tutorials.simsek.jpatutorial.command;

import org.springframework.stereotype.Component;

import com.tutorials.simsek.jpatutorial.dto.CustomerAddRequest;
import com.tutorials.simsek.jpatutorial.dto.CustomerAddResponse;
@Component
public class CustomerAddCommand extends BaseCommand<CustomerAddRequest,CustomerAddResponse> {

	@Override
	public CustomerAddResponse perform(CustomerAddRequest req) {
		return new CustomerAddResponse();
	}

	@Override
	public CustomerAddResponse validate(CustomerAddRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
}
