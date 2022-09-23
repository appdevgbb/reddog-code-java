package com.microsoft.gbb.reddog.accountingservice.repositories;

import com.microsoft.gbb.reddog.accountingservice.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
    List<Product> findAll();

}