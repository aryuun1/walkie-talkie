package com.chat.application.app.controller;

import com.chat.application.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    // /app/sendMessage = when a message is sent on this.... it will get broadCasted to all the /topic/messages




    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
