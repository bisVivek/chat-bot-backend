package com.chatBot.chatBot.Model;

public class ChatMessage {
    private String sender;
    private String content;
    private String roomId;

    public ChatMessage() {}

    public ChatMessage(String sender, String content, String roomId) {
        this.sender = sender;
        this.content = content;
        this.roomId = roomId;
    }

    // Getters and Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
