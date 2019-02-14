package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.modal.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
