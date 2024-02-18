package com.atif.ecommerce.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommonRepository<T, ID> extends MongoRepository<T, ID> {
}