package com.swedbank.core.demo.service;

import com.swedbank.core.demo.api.model.Response;
import org.springframework.stereotype.Component;

@Component
public class Service {
    public Response performAction() {
        return new Response("A long string value");
    }
}
