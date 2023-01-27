package com.example.testbackend.api;

import com.example.testbackend.business.TestBusiness;
import com.example.testbackend.model.MRegisterRequest;
import com.example.testbackend.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestAPI {

    @Autowired
    private TestBusiness business;
    @GetMapping
    public TestResponse test(){
        TestResponse response = new TestResponse();
        response.setName("Que");
        response.setFood("KFC");

        return response;
    }
    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request) {
        String response;
        try {
            response = business.register(request);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        }
    }
}
