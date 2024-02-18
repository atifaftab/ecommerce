package com.atif.ecommerce.ecommerce.service;

import com.atif.ecommerce.ecommerce.repository.CommonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommonService<T, ID> {

    private CommonRepository<T, ID> repository;

    List<T> getAll() {
        return repository.findAll();
    }

    Optional<T> getById(ID id) {
        return repository.findById(id);
    }

    T save(T entity) {
        return repository.save(entity);
    }

    void deleteById(ID id) {
        repository.deleteById(id);
    }

}
