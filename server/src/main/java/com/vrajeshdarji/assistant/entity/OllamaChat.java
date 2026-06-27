package com.vrajeshdarji.assistant.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "tbl_chat")
@Data
@NoArgsConstructor
public class OllamaChat {
// id, chat name, chat history class , boolean temp or not, files ,createdAt, updatedAt,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false, unique = true,  nullable = false)
    private UUID chatId;
    private String title;
    private boolean isTemp;
    @OneToOne(cascade = CascadeType.ALL,
            mappedBy = "ollamaChat"
    )
    private ChatHistory chatHistory;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
}
