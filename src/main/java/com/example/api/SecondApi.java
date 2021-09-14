package com.example.api;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import reactor.core.publisher.Mono;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public interface SecondApi {
    @Get(value = "/{id2}",
            produces = {MediaType.APPLICATION_JSON}
    )
    default Mono<HttpResponse<String>> getApi2(
            @PathVariable("id") @Size(min = 1, max = 30) @Pattern(regexp = "^[a-zA-Z0-9_]*$") String id,
            @PathVariable("id2") @Size(min = 1, max = 30) @Pattern(regexp = "^[a-zA-Z0-9_]*$") String id2
    ) {
        return Mono.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }
}
