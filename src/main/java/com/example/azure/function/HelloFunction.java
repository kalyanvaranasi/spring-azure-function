package com.example.azure.function;

import com.example.azure.function.models.Greeting;
import com.example.azure.function.models.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class HelloFunction implements Function<Mono<User>, Mono<Greeting>> {

    public Mono<Greeting> apply(Mono<User> mono) {
        return mono.map(user -> new Greeting("Hello, " + user.getName() + "!\n"));
    }
}
