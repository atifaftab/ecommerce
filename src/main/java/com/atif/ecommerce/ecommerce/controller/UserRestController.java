package com.atif.ecommerce.ecommerce.controller;

import com.atif.ecommerce.ecommerce.entity.User;
import com.atif.ecommerce.ecommerce.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
@AllArgsConstructor
public class UserRestController {
    private CommonService<User, String> userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
}
