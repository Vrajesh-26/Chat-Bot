package com.vrajeshdarji.assistant.dto;

import com.vrajeshdarji.assistant.model.message;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatHistoryDTO {
    private List<message> messages;
}
