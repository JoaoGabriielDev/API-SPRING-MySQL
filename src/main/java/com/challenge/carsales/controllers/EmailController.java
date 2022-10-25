package com.challenge.carsales.controllers;

import com.challenge.carsales.dtos.EmailDTO;
import com.challenge.carsales.entities.Email;
import com.challenge.carsales.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.util.Optional;
import java.util.UUID;

@RestController
    public class EmailController {

        @Autowired
        EmailService emailService;

        @PostMapping("/sending-email")
        public ResponseEntity<Email> sendingEmail(@RequestBody @Valid EmailDTO emailDTO) {
            Email email = new Email();
            BeanUtils.copyProperties(emailDTO, email);
            emailService.sendEmail(email);
            return new ResponseEntity<>(email, HttpStatus.CREATED);
        }

        @GetMapping("/emails")
        public ResponseEntity<Page<Email>> getAllEmails(@PageableDefault(page = 0, size = 5, sort = "emailId", direction = Sort.Direction.DESC) Pageable pageable){
            return new ResponseEntity<>(emailService.findAll(pageable), HttpStatus.OK);
        }

        @GetMapping("/emails/{emailId}")
        public ResponseEntity<Object> getOneEmail(@PathVariable(value="emailId") UUID emailId){
            Optional<Email> emailModelOptional = emailService.findById(emailId);
            if(!emailModelOptional.isPresent()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email not found.");
            }else {
                return ResponseEntity.status(HttpStatus.OK).body(emailModelOptional.get());
            }
        }
    }
