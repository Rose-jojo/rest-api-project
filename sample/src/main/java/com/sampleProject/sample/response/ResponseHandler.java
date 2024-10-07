package com.sampleProject.sample.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuider(String message, HttpStatus httpstatus,
     Object responseobject
    ){

        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("httpstatus",httpstatus);
        response.put("data",responseobject);

        return new ResponseEntity<>(response,httpstatus);



    }
    
}
