package com.vrajeshdarji.assistant.model;

import com.vrajeshdarji.assistant.entity.MessageRole;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class message {
    private MessageRole role;
    private String content;
}
