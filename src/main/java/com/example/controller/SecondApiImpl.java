package com.example.controller;

import com.example.api.SecondApi;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Singleton
@Controller("/first/{id}/second")
public class SecondApiImpl implements SecondApi {
    @Override
    public Mono<HttpResponse<String>> getApi2(String id, @Size(min = 1, max = 30) @Pattern(regexp = "^[a-zA-Z0-9_]*$") String id2) {
        return Mono.just("second: " + id + "/" + id2).map(HttpResponse::ok);
    }
}
