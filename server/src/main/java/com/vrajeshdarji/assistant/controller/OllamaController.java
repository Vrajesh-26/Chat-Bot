package com.vrajeshdarji.assistant.controller;

import com.vrajeshdarji.assistant.dto.ChatInfoDTO;
import com.vrajeshdarji.assistant.dto.OllamaMessageDTO;
import com.vrajeshdarji.assistant.entity.MessageRole;
import com.vrajeshdarji.assistant.io.ChatResponse;
import com.vrajeshdarji.assistant.service.OllamaService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ollama")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OllamaController {

    final OllamaService ollamaService;

    @GetMapping
    public List<ChatInfoDTO> getChats(){
        ChatInfoDTO chatInfoDTO1 = new ChatInfoDTO();
        chatInfoDTO1.setChatId(new UUID(0, 0));
        chatInfoDTO1.setTitle("Chats");
        chatInfoDTO1.setCreatedAt(LocalDateTime.now());

        ChatInfoDTO chatInfoDTO2 = new ChatInfoDTO();
        chatInfoDTO2.setChatId(new UUID(0, 0));
        chatInfoDTO2.setTitle("Chats");
        chatInfoDTO2.setCreatedAt(LocalDateTime.now());

        List<ChatInfoDTO> chatInfoDTOList = new ArrayList<>();
        chatInfoDTOList.add(chatInfoDTO1);
        chatInfoDTOList.add(chatInfoDTO2);
        return chatInfoDTOList;
    }

    @GetMapping("/{chatId}")
    public ChatResponse getChat(@PathVariable UUID chatId){
        // service call to get whole chat response
        return new ChatResponse();
    }

    @PostMapping
    public ChatResponse createChat(@RequestBody String message){
        System.out.println(message);
        return ChatResponse.builder()
                .chatId(new UUID(0, 0))
                .role(MessageRole.ASSISTANT)
                .content("Hello how can i help you") // response of ollama
                .build();
    }

    @PostMapping("/{chatId}")
    public OllamaMessageDTO createChat(@PathVariable UUID chatId, @RequestBody String message){
        System.out.println(chatId);
        System.out.println(message);
        // service to store use prompt
        // service to call ollama
        // store ollama response

        // return only latest chat response
        return null;
    }


}





















