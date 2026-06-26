package com.vrajeshdarji.assistant.controller;

import com.vrajeshdarji.assistant.service.OllamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OllamaController {

    final OllamaService ollamaService;
}
