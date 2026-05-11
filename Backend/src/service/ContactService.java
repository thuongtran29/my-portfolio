package com.yourname.portfolio.service;

import com.yourname.portfolio.model.ContactMessage;
import com.yourname.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public void saveMessage(ContactMessage message) {
        contactRepository.save(message);
        System.out.println("[CONTACT] New message from: " + message.getName() + " <" + message.getEmail() + ">");
    }
}
