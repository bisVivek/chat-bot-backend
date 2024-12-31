package com.chatBot.chatBot.Repository;

import com.chatBot.chatBot.Model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {}

