package com.example.api;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import reactor.core.publisher.Mono;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public interface FirstApi {
        @Get(value = "/{id}",
                produces = {MediaType.APPLICATION_JSON}
        )
        default Mono<HttpResponse<String>> get(
                @PathVariable("id") @Size(min = 1, max = 30) @Pattern(regexp = "^[a-zA-Z0-9_]*$") String id
        ) {
            return Mono.fromCallable(() -> {
                throw new UnsupportedOperationException();
            });
        }
}
