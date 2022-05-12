package com.example.childproject.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.childproject.util.TOMLGenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public String example() {
        // create an example hashmap
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        return new TOMLGenerator(map).toString();
    }
}
