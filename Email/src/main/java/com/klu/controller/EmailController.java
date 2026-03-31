package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	@GetMapping("/send")
	public String sendSimpleEmail(@RequestParam String to,@RequestParam String subject,@RequestParam String text) {
		return emailService.sendSimpleMail(to,subject,text);
		
	}
	
	@PostMapping("/setattachment")
	public String sendEmailWithAttachment(@RequestParam String to,@RequestParam String subject,@RequestParam String text,@RequestParam String path) {
		return emailService.sendMailWithAttachment(to, subject, text, path);
	}

}
