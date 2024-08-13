package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {

        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("renan");
        person.setLastName("pa");
        person.setAddress("rua rua");
        person.setGender("male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {

        logger.info("Finding all people");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("person name " + i);
        person.setLastName("last" + i) ;
        person.setAddress("rua rua" + i);
        person.setGender("male");
        return person;

    }

    public Person create(Person person) {

        logger.info("Creating one person!");
        return person;
    }

    public Person update(Person person) {

        logger.info("Updating one person!");
        return person;
    }
    public void delete(String id) {

        logger.info("Deleting one person!");
    }
}