package com.avmfs.Auth;

import com.avmfs.Services.Model.Person;
import com.avmfs.Utility.UserRole;

public interface Auth {
    void register(String firstName, String lastName, String email, String password, UserRole userRole);
    void login(String username, String password);
    void logout();
}
