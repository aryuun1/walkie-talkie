package com.chat.application.app.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// as this is a configuration class, we can tell spring that this is a configuration class.

@Configuration
@EnableWebSocketMessageBroker
public class webSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat").setAllowedOrigins("https://localhost:8080")
                .withSockJS();

        //what we did here is.... we are adding an endpoint i.e., "/chat",
        // we want to entertain request from setallowedorigin.... this will prevent any unallowed broadcasts....
        //withSockJs ==  adds compatibility for clients that dont support websockets. making the project accessible to more users.
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //set message broker
        registry.enableSimpleBroker("/topic"); //enables a broker that can handle messages for topics.
        // /topics/chat1 =  so ab... whoever is subscribed to this... will receive the message.

        registry.setApplicationDestinationPrefixes("/app");
        //expect message with /app/sendmessage


    }
}
