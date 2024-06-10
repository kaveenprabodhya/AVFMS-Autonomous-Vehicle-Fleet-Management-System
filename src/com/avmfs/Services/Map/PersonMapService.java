package com.avmfs.Services.Map;

import com.avmfs.Services.Model.Person;
import com.avmfs.Services.PersonService;

import java.util.Set;

public class PersonMapService extends AbstractMapService<Person, Long> implements PersonService {

    public PersonMapService() {
    }

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public Person findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Person save(Person object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }
}
