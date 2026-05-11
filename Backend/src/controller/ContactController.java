package com.yourname.portfolio.controller;

import com.yourname.portfolio.model.ContactMessage;
import com.yourname.portfolio.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Map<String, Object>> receiveMessage(@Valid @RequestBody ContactMessage message) {
        contactService.saveMessage(message);
        return ResponseEntity.ok(Map.of(
            "success", true,
            "message", "Message received! I'll get back to you soon. 🚀"
        ));
    }

    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> status() {
        return ResponseEntity.ok(Map.of(
            "status", "online",
            "message", "Building something cool... ☕"
        ));
    }
}
