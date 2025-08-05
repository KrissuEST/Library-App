package com.kristjan.springbootlibrary.controller;

import com.kristjan.springbootlibrary.entity.Message;
import com.kristjan.springbootlibrary.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/messages")
public class MessagesController {

    private MessagesService messagesService;

    @Autowired
    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @PostMapping("/secure/add/message")
    public void postMessage(@AuthenticationPrincipal Jwt jwt,
                            @RequestBody Message messageRequest) {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        messagesService.postMessage(messageRequest, userEmail);
    }
}
