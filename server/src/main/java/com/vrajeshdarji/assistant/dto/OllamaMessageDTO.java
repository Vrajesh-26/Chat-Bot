package com.vrajeshdarji.assistant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OllamaMessageDTO {

    private UUID chatId;
    private String title;
    private boolean isTemp;
}
