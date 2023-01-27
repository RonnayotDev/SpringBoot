package com.example.testbackend.business;

import com.example.testbackend.model.MRegisterRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
public class TestBusiness {
    public String register(MRegisterRequest request) throws IOException {

        if(request == null) {
            throw new IOException("null request");
        }
        if (Objects.isNull(request.getEmail())){
            throw new IOException("null email");
        }
        return "";
    }
}
