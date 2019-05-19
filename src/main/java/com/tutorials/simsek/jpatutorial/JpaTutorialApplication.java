package com.tutorials.simsek.jpatutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tutorials.simsek.jpatutorial.dto.PersonAddRequest;
import com.tutorials.simsek.jpatutorial.dto.PersonUpdateRequest;
import com.tutorials.simsek.jpatutorial.service.impl.PersonServiceImpl;

@SpringBootApplication
public class JpaTutorialApplication implements CommandLineRunner {
	@Autowired
	PersonServiceImpl personService;

	public static void main(String[] args) {
		SpringApplication.run(JpaTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonAddRequest req = new PersonAddRequest();
		PersonUpdateRequest req2 = new PersonUpdateRequest();
		req.setId(1L);
		req.setName("hayri");
		personService.save(req);
		req = new PersonAddRequest();
		req.setId(12L);
		req.setName("hayri1");
		personService.save(req);
		req = new PersonAddRequest();
		req.setId(3L);
		req.setName("hayri2");
		personService.save(req);
		req = new PersonAddRequest();
		req.setId(4L);
		req.setName("hayri3");
		personService.save(req);
		req2.setId(3L);
		req2.setName("Modified");
		personService.update(req2);
	}

}
