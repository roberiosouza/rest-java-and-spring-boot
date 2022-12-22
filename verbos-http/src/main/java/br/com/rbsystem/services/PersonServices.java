package br.com.rbsystem.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rbsystem.exceptions.ResourceNotFoundException;
import br.com.rbsystem.model.Person;
import br.com.rbsystem.repositories.PersonRepository;

@Service
public class PersonServices {
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		
		logger.info("Find all people!");	
		
		return repository.findAll();
	}
	
	public Person findById(Long id) {
		
		logger.info("Finding one person!");
		
		Person person = new Person();

		person.setFirstName("Thor");
		person.setLastName("Apolo");
		person.setAddress("Rua dogs");
		person.setGender("Masc");
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Not records found for this id!"));
	}
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Updating one person!");

		var entity = repository.findById(person.getId())
			.orElseThrow(() -> new ResourceNotFoundException("Not records found for this id!"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(person);
	}
	
	public void delete(Long id) {
		logger.info("Deleting one person!");
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Not records found for this id!"));
		repository.delete(entity);
	}
	
	public Person mockPerson(int i) {
		
		Person person = new Person();
		
		person.setFirstName("Name Person " + i);
		person.setLastName("Last Name " + i);
		person.setAddress("Address " + i);
		person.setGender("Gender " + i);
		
		return person;
		
	}

}
