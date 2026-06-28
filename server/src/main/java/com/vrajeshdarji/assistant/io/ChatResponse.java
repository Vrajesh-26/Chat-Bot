package com.vrajeshdarji.assistant.io;

import com.vrajeshdarji.assistant.entity.ChatHistory;
import com.vrajeshdarji.assistant.entity.MessageRole;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatResponse {

    private UUID chatId;

    private MessageRole role;

    private String content;

    private LocalDateTime timestamp;

    private ChatHistory chatHistory;
}
