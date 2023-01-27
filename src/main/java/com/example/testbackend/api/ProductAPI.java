package com.example.testbackend.api;

import com.example.testbackend.business.ProductBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAPI {
    @Autowired
    private ProductBusiness business;
    @GetMapping("/{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id") String id){
        String response = business.getProductById(id);
        return ResponseEntity.ok(response);
    }
}
