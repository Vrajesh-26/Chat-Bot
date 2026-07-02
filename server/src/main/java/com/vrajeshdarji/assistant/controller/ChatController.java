package com.vrajeshdarji.assistant.controller;

import com.vrajeshdarji.assistant.dto.ChatMessageRequest;
import com.vrajeshdarji.assistant.dto.ChatMessageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/chat")
@AllArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping("{/sessionId}")
    @ResponseStatus(HttpStatus.OK)
    public ChatMessageResponse sendMessage(
            @PathVariable String sessionId,
            @Validated @RequestBody ChatMessageRequest chatMessageRequest) {
        try{
            ChatMessageResponse response = chatService.sendMessage(sessionId, chatMessageRequest);
            return response;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Something went wrong with chat message");
        }
    }

    // Streaming - tokens pushed to React as they arrive from Ollama
    @PostMapping(value = "/{sessionId}/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamMessage(
            @PathVariable String sessionId,
            @Validated @RequestBody ChatMessageRequest request) {
        return chatService.streamMessage(sessionId, request);
    }
}
