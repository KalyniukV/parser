package org.example.exception;

public class SportNotFoundException extends Exception {

    public SportNotFoundException(String sportName) {
        super("Sport " + sportName + " not found");
    }
}
