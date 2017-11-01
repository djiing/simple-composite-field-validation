package com.example.demo.repository;

import com.example.demo.model.DBUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoRepository extends MongoRepository<DBUser, Long> {
}
