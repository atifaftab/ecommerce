package com.atif.ecommerce.ecommerce.repository;

import com.atif.ecommerce.ecommerce.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CommonRepository extends MongoRepository<User, String> {
}