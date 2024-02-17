package com.atif.ecommerce.ecommerce.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Entity
@Builder
@Document(collection = "user")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;


}
