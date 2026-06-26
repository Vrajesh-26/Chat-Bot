package com.vrajeshdarji.assistant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "tbl_chat")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class OllamaChat {
// id, chat name, chat history class , boolean temp or not, files ,createdAt, updatedAt,
}
