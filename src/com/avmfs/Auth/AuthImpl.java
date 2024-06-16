package com.avmfs.Auth;

import com.avmfs.Services.Model.Person;
import com.avmfs.Services.Model.Token;
import com.avmfs.Services.PersonService;
import com.avmfs.Utility.UserRole;

public class AuthImpl implements Auth {

    private final PersonService personService;
    private final Person currentUser;

    public AuthImpl(PersonService personService, Person currentUser) {
        this.personService = personService;
        this.currentUser = currentUser;
    }

    @Override
    public void register(String firstName, String lastName, String email, String password, UserRole userRole) {
        Person user = new Person(null, firstName, lastName, email, password, userRole);
        Person savedUser = personService.save(user);
        Token token = new Token(user.getId());
        savedUser.setToken(token);
    }

    @Override
    public void login(String username, String password) {
        Person user = this.personService.findByUsername(username);
        // TODO Validation
        Token token = new Token(user.getId());
        user.setToken(token);
    }

    @Override
    public void logout() {
        this.currentUser.setToken(null);
    }
}
