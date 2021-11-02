package ca.mcgill.ecse321.eventregistrationfall2021.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import ca.mcgill.ecse321.eventregistrationfall2021.dao.EventRepository;
import ca.mcgill.ecse321.eventregistrationfall2021.dao.PersonRepository;
import ca.mcgill.ecse321.eventregistrationfall2021.dao.RegistrationRepository;
import ca.mcgill.ecse321.eventregistrationfall2021.models.Event;
import ca.mcgill.ecse321.eventregistrationfall2021.models.Person;
import ca.mcgill.ecse321.eventregistrationfall2021.models.Registration;


@ExtendWith(MockitoExtension.class)
public class TestEventRegistrationService {
	
}