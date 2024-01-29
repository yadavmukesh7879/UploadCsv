package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    private Long id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModifiedAt;
    private Double price;

    public Products copy(){
        return new Products(id,name,description,createdAt,lastModifiedAt,price);
    }

}
