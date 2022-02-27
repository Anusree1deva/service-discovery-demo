package com.servicedis.clientdiscovery.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControll {
    @Value("${spring.application.name}")
    private String name;
    
    @Value("${server.port}")
    private String port;
    @GetMapping(value={"", "/"})
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> body = Map.of("name", name, "port", port);
        return ResponseEntity.ok(body);
    }
}
