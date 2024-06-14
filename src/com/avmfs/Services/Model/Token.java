package com.avmfs.Services.Model;

import java.time.LocalTime;
import java.util.UUID;

public class Token {
    private final LocalTime expired;
    private final String tokenValue;

    public Token(long uId) {
        LocalTime created = LocalTime.now();
        int TOKEN_LIFETIME_MINUTES = 30;
        this.expired = created.plusMinutes(TOKEN_LIFETIME_MINUTES);
        this.tokenValue = generateToken(uId);
    }

    private String generateToken(long uId) {
        return UUID.randomUUID().toString() + "-" + uId;
    }

    public boolean isTokenExpired() {
        return LocalTime.now().isAfter(expired);
    }

    public String getTokenValue() {
        if (isTokenExpired()) {
            return null;
        }
        return tokenValue;
    }
}
