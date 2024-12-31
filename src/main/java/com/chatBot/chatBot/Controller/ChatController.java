package com.chatBot.chatBot.Controller;


import com.chatBot.chatBot.Model.ChatMessage;
import com.chatBot.chatBot.Model.ChatRoom;
import com.chatBot.chatBot.Service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatRoomService chatRoomService;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("/rooms")
    public List<ChatRoom> getChatRooms() {
        return chatRoomService.getAllRooms();
    }

    @PostMapping("/rooms")
    public ChatRoom createChatRoom(@RequestParam String name) {
        return chatRoomService.createRoom(name);
    }
}
