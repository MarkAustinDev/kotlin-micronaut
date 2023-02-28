package com.example.controllers

import com.example.client.ErgastClient
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import reactor.core.publisher.Mono

@Controller("/results")
class ResultsController(private val ergastCLient: ErgastClient) {

    // APPLICATION_JSON_STREAM type will enable the file to be downloaded. APPLICATION_JSON returns a string
    @Get("/{year}/{driver}", produces = [APPLICATION_JSON])
    fun results(@PathVariable year: String, @PathVariable driver: String): Mono<String> {
        return ergastCLient.fetchResults(year, driver)
    }
}