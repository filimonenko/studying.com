package edu.autoservice.service;

import edu.autoservice.model.Person;

public interface PersonDataProvider {

    void savePerson(Person person);

    Person getPerson(int id);

    void removePerson(int id);

}
