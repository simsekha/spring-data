package com.tutorials.simsek.jpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.simsek.jpatutorial.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
