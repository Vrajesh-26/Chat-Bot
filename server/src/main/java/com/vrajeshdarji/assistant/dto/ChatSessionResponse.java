package com.vrajeshdarji.assistant.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ChatSessionResponse {

    private String sessionId;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;
    private List<ChatMessageResponse> messages;
}
