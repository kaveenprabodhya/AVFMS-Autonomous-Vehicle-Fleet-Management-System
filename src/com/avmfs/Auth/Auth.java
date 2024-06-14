package com.avmfs.Auth;

import com.avmfs.Services.Model.Person;

public interface Auth {
    void register(String username, String password);
    void login(String username, String password);
    void logout(Person currentUser);
}
