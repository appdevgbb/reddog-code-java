package com.microsoft.gbb.reddog.orderservice.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.gbb.reddog.orderservice.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ProductRespository
{
    @Value("classpath:${data.local.PRODUCT_DEFINITION_FILE}")
    Resource productResource;

    public Product[] getAllProducts()
    {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            return mapper.readValue(productResource.getInputStream(), new TypeReference<Product[]>() {});
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
