package com.microsoft.gbb.reddog;

import io.micronaut.http.annotation.*;

@Controller("/orderservice")
public class OrderserviceController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}