package com.tutorials.simsek.jpatutorial.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.tutorials.simsek.jpatutorial.dto.CustomerAddRequest;
import com.tutorials.simsek.jpatutorial.entity.Customer;

@Component
public class CustomerFromCustomerAdd implements Converter<CustomerAddRequest, Customer> {

	@Override
	public Customer convert(CustomerAddRequest source) {
		return new Customer();
	}
}
