package com.vrajeshdarji.assistant.io;

import com.vrajeshdarji.assistant.entity.MessageRole;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatResponse {

    private UUID chatId;

    private MessageRole role;

    private String content;

    private LocalDateTime timestamp;
}
