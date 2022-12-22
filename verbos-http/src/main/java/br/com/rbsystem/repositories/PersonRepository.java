package br.com.rbsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rbsystem.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
