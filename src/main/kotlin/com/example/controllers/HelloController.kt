package com.example.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
private class HelloController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
     fun index() = "hello world"
}