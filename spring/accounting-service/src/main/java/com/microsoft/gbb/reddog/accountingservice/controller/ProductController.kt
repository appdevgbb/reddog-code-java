package com.microsoft.gbb.reddog.accountingservice.controller

import com.microsoft.gbb.reddog.accountingservice.entities.Product
import com.microsoft.gbb.reddog.accountingservice.exception.ProductsNotFoundException
import com.microsoft.gbb.reddog.accountingservice.service.ProductService
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@Slf4j
class ProductController(private val productService: ProductService) {
    @get:CrossOrigin(origins = ["*"])
    @get:GetMapping(value = ["/products"])
    val allProducts: ResponseEntity<List<Product>>
        get() {
            val products = Optional.ofNullable(productService.allProducts).orElseThrow {
                ProductsNotFoundException("Unable to fetch products")
            }
            return ResponseEntity.ok(products)
        }
}