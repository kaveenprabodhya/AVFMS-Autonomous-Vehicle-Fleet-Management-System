package com.avmfs.Auth;

import com.avmfs.Services.Model.Person;
import com.avmfs.Services.Model.Token;
import com.avmfs.Services.PersonService;

public class AuthImpl implements Auth {

    private final PersonService personService;

    public AuthImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void register(String username, String password) {
    }

    @Override
    public void login(String username, String password) {
        Person user = this.personService.findByUsername(username);
        // TODO Validation
        Token token = new Token(user.getId());
        user.setToken(token);
    }

    @Override
    public void logout(Person currentUser) {
        currentUser.setToken(null);
    }
}
