package com.avmfs.Auth;

public interface Auth {
    void register(String username, String password);
    void login(String username, String password);
}
