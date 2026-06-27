package com.vrajeshdarji.assistant.controller;

import com.vrajeshdarji.assistant.service.OllamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ollama")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OllamaController {

    final OllamaService ollamaService;

    @GetMapping
    public ResponseEntity<String> getResponse(@RequestBody String message){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
