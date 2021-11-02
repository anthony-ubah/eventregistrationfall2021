package ca.mcgill.ecse321.eventregistrationfall2021.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistrationfall2021.models.Event;

public interface EventRepository extends CrudRepository<Event, String> {

	Event findEventByName(String name);

}