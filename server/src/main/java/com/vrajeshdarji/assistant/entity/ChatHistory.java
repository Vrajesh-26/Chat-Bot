package com.vrajeshdarji.assistant.entity;

import com.vrajeshdarji.assistant.model.message;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tbl_chat_history")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "chat_id", referencedColumnName = "id")
    private OllamaChat ollamaChat;
    @ElementCollection
    private List<message> messages;
}
