package com.tutorials.simsek.jpatutorial.command;

import org.springframework.stereotype.Component;

import com.tutorials.simsek.jpatutorial.converter.CustomerFromCustomerAdd;
import com.tutorials.simsek.jpatutorial.dto.CustomerAddRequest;
import com.tutorials.simsek.jpatutorial.dto.CustomerAddResponse;
import com.tutorials.simsek.jpatutorial.entity.Customer;
@Component
public class CustomerAddCommand extends BaseCommand<CustomerAddRequest,CustomerAddResponse,Customer> {

	public CustomerAddCommand(CustomerFromCustomerAdd converter) {
		super(converter);
	}
	@Override
	public CustomerAddResponse perform(CustomerAddRequest req) {
		return new CustomerAddResponse();
	}

	@Override
	public CustomerAddResponse validateRequest(CustomerAddRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
