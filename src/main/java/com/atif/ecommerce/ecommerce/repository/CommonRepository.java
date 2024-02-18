package com.atif.ecommerce.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommonRepository<T, ID> extends MongoRepository<T, ID> {
    //    List<T> findAll(Example<T> example, Sort sort);
//    Optional<T> findById(ID id);


}

