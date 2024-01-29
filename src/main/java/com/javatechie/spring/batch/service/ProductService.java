package com.javatechie.spring.batch.service;

import com.javatechie.spring.batch.entity.Products;
import com.javatechie.spring.batch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void multiplyRecord(long size) {
        List<Products> products = productRepository.findAll();
        Optional<Products> maxId = products.stream().collect(Collectors.maxBy(Comparator.comparing(Products::getId)));
        IntStream.range(1,Integer.parseInt(maxId.get().getId()+"")).forEach(idx-> {
            for (int i=Integer.parseInt(maxId.get().getId()+"")+1; i < size; i++){
                Products products1 = null;
                try{
                    products1 = products.get(idx).copy();
                    products1.setId(Long.valueOf(i));
                    productRepository.save(products1);
                }catch (ArrayIndexOutOfBoundsException e){

                }
            }
        });
    }
}
