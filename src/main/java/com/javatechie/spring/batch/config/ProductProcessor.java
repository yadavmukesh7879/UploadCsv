package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Products;
import org.springframework.batch.item.ItemProcessor;

public class ProductProcessor implements ItemProcessor<Products, Products> {

    @Override
    public Products process(Products product) throws Exception {
        product.setPrice(product.getPrice()*2);
        return product;
    }
}
