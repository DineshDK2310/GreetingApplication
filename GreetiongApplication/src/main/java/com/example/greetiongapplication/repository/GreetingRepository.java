package com.example.greetiongapplication.repository;

import com.example.greetiongapplication.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Greeting getOne(long id);
}
