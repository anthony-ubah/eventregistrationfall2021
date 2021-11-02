package ca.mcgill.ecse321.eventregistrationfall2021.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistrationfall2021.models.Person;

public interface PersonRepository extends CrudRepository<Person, String>{

	Person findPersonByName(String name);

}