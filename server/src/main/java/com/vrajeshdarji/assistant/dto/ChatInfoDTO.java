package com.vrajeshdarji.assistant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ChatInfoDTO {

    private UUID chatId;

    private String title;

    private LocalDateTime createdAt;
}
