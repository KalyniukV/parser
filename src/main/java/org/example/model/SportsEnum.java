package org.example.model;

public enum SportsEnum {
    SOCCER("Soccer"),
    TENNIS("Tennis"),
    HOCKEY("IceHockey"),
    BASKETBALL("Basketball");

    String value;

    SportsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
