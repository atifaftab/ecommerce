package com.atif.ecommerce.ecommerce.service;

import com.atif.ecommerce.ecommerce.entity.User;
import com.atif.ecommerce.ecommerce.repository.CommonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommonService {

    private CommonRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getById(String id) {
        return repository.findById(id).get();
    }

//    public T save(T entity) {
//        return repository.save(entity);
//    }
//
//    public void deleteById(ID id) {
//        repository.deleteById(id);
}
