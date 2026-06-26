package com.vrajeshdarji.assistant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OllamaMessageDTO {

    private String chatId;
    private String chatResponse;
    private String sender;
    private String modelName;
    private List<ChatHistoryDTO> chatHistory;
}
