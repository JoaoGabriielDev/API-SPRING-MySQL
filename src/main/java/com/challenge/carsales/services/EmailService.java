package com.challenge.carsales.services;

import com.challenge.carsales.entities.Email;
import com.challenge.carsales.enums.StatusEmail;
import com.challenge.carsales.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public interface EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    default Email sendEmail(Email email) {
        email.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            emailSender.send(message);

            email.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e){
            email.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(email);
        }
    }

     default Page<Email> findAll(Pageable pageable) {
        return  emailRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    default Optional<Email> findById(UUID emailId) {
        return emailRepository.findById(emailId);
    }
}
