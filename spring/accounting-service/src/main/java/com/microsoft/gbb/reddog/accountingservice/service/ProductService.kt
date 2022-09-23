package com.microsoft.gbb.reddog.accountingservice.service

import com.microsoft.gbb.reddog.accountingservice.entities.Product
import com.microsoft.gbb.reddog.accountingservice.repositories.ProductRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Slf4j
@Service
class ProductService(private val productRepository: ProductRepository) {
    val allProducts: List<Product>
        get() = productRepository.findAll()
}