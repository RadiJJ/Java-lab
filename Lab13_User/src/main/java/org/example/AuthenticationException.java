package org.example;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message, Exception error){
        super(message, error);
    }
    public AuthenticationException(String message) {
        super(message);
    }
}