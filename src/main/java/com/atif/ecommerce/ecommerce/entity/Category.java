package com.atif.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Builder
public class Category implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;

}
