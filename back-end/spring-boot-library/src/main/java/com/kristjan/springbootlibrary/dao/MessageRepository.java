package com.kristjan.springbootlibrary.dao;

import com.kristjan.springbootlibrary.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface MessageRepository extends JpaRepository<Message, Long> {

    // So we can find all messages by user
    Page<Message> findByUserEmail(@RequestParam("user_email") String userEmail, Pageable pageable);
}