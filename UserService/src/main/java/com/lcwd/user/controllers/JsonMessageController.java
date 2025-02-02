package com.lcwd.user.controllers;

import com.lcwd.user.entities.User;
import com.lcwd.user.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PutMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user)
    {
jsonKafkaProducer.sendMessage(user);
return ResponseEntity.ok("Json Message sent to kafka topic");
    }
}
