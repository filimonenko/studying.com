package edu.autoservice.service.impl;

import edu.autoservice.model.Person;
import edu.autoservice.service.PersonDataProvider;

import java.util.HashMap;
import java.util.Map;

public class PersonDataProviderImpl implements PersonDataProvider {

    private static final Map<Integer, Person> PERSONS = new HashMap<>();

    @Override
    public void savePerson(Person person) {
        PERSONS.put(person.getId(),person);
    }

    @Override
    public Person getPerson(int id) {
        return PERSONS.get(id);
    }

    @Override
    public void removePerson(int id) {
        PERSONS.remove(id);
    }
}
