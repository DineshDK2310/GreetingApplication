package com.example.greetiongapplication.service;

import com.example.greetiongapplication.model.Greeting;
import com.example.greetiongapplication.model.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);
    List<Greeting> getGreetings();

    Optional<Greeting> getGreetingById(long id);

    Greeting postGreetings(User user);

    void deleteGreetingById(long id);

    Greeting updateGreetings(Greeting greeting);
}
