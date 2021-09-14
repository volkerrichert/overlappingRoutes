package com.example.controller;

import com.example.api.FirstApi;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
@Controller("/first")
public class FirstApiImpl implements FirstApi {
    @Override
    public Mono<HttpResponse<String>> get(String id) {
        return Mono.just("first: " + id).map(HttpResponse::ok);
    }
}
