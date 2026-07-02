package com.vrajeshdarji.assistant.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatSessionSummary {

    private String sessionId;
    private String title;
    private LocalDateTime lastUpdated;
}
