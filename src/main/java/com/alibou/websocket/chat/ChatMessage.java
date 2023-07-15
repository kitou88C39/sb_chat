package com.alibou.websocket.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ChatMessage {
    
    private String content;
    private String sender;
    private MessageType type;
}
