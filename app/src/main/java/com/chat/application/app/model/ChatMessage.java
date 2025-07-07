package com.chat.application.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage{
    private Integer id;
    private String sender;
    private String content;
}