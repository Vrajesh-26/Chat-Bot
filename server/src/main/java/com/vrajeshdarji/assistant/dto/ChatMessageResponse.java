package com.vrajeshdarji.assistant.dto;

import com.vrajeshdarji.assistant.entity.MessageRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessageResponse {

    private String messageId;
    private MessageRole role;
    private String content;
    private LocalDateTime timestamp;

}
