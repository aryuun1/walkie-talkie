//package com.chat.application.app.repository;
//
//import com.chat.application.app.model.ChatMessage;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Repository
//public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
//
//    List<ChatMessage> findTop50ByOrderByTimestampDesc();
//
//    List<ChatMessage> findBySenderOrderByTimestampDesc(String sender);
//
//    List<ChatMessage> findAllByOrderByTimestampAsc();
//
//    List<ChatMessage> findByTimestampBetweenOrderByTimestampAsc(
//            LocalDateTime start, LocalDateTime end);
//
//    @Query("SELECT c FROM ChatMessage c WHERE c.content LIKE %?1% ORDER BY c.timestamp DESC")
//    List<ChatMessage> findByContentContaining(String keyword);
//    long countBySender(String sender);
//}
