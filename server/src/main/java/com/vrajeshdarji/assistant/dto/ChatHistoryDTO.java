package com.vrajeshdarji.assistant.dto;

import com.vrajeshdarji.assistant.entity.ChatHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatHistoryDTO {

    private List<ChatHistory> chatHistory;
}
