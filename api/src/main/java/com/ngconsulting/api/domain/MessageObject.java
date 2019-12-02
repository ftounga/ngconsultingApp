package com.ngconsulting.api.domain;

public enum MessageObject {

    OPPORTUNITY("OPPORTUNITY"),
    QUESTION("QUESTION"),
    FEEDBACK("FEEDBACK"),
    OTHER("OTHER");

    private String value;

    MessageObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static MessageObject fromValue(String type) {
        switch (type) {
            case "OPPORTUNITY":
                return OPPORTUNITY;
            case "QUESTION":
                return QUESTION;
            case "FEEDBACK":
                return FEEDBACK;
            case "OTHER":
                return OTHER;
            default:
                return null;
        }
    }
}
