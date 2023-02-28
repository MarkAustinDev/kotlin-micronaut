package com.example.client

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.uri.UriBuilder
import jakarta.inject.Singleton
import java.net.URI
import reactor.core.publisher.Mono


// @Singleton Ensures only 1 instance of the class is created
// @param:Client matches with value in application.yml
@Singleton
class ErgastClient(@param:Client(id = "ergast") private val httpClient: HttpClient) {

    fun fetchResults(year: String, driver: String): Mono<String> {
        val uri: URI = UriBuilder.of("/api/f1/$year/drivers/$driver/results").build()
        val req: HttpRequest<*> = HttpRequest.GET<Any>(uri)

        // Response from client is XML - this needs parsing
        return Mono.from(httpClient.retrieve(req))
    }
}