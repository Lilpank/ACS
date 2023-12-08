package com.study.services;

import com.study.models.Email;
import com.study.repos.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailService {
    private final EmailRepository emailRepository;

    @Autowired
    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public void save(Email email) {
        emailRepository.save(email);
    }
}
