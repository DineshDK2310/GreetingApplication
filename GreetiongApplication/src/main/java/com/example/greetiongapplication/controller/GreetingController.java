package com.example.greetiongapplication.controller;

import com.example.greetiongapplication.model.Greeting;

import com.example.greetiongapplication.model.User;
import com.example.greetiongapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "fName",defaultValue = "World") String fName,
                             @RequestParam(value = "lName", defaultValue = "World") String lName) {
        User user = new User();
        user.setFirstName(fName);
        user.setLastName(lName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/messages")
    public List<Greeting> greeting() {
        return greetingService.getGreetings();
    }


    @GetMapping("/messages/{id}")
    public Optional<Greeting> greeting(@PathVariable long id) {
        return greetingService.getGreetingById(id);
    }


    @PostMapping("/messages")
    public Greeting greeting(User user) {
        return greetingService.postGreetings(user);
    }


    @DeleteMapping("/messages/{id}")
    public void deleteGreeting(@PathVariable long id) {
        greetingService.deleteGreetingById(id);
    }


    @PutMapping("/messages")
    public Greeting updateGreetingMessage(@RequestBody Greeting greeting) {
        return greetingService.updateGreetings(greeting);
    }
}