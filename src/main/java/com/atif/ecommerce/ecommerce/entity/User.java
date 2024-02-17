package com.atif.ecommerce.ecommerce.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;


}
