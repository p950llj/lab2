package com.swedbank.core.demo.api.model;

public class Response {
    private String value;

    public Response(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
