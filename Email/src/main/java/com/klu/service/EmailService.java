package com.klu.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	//email without attachment
	
	public String sendSimpleMail(String to,String subject,String text) {
		try {
			MimeMessage message=mailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message,false);
			
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			mailSender.send(message);
			return "simple email sent successfully";
			
		}
		catch(Exception e) {
			return "Exception Occoured"+e.getMessage();
		}
	}
	
	//email with attachment
	public String sendMailWithAttachment(String to,String subject,String text,String path) {
		try {
			MimeMessage message=mailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper( message,true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			FileSystemResource file=new FileSystemResource(new File(path));
			helper.addAttachment(file.getFilename(), file);
			mailSender.send(message);
		
			return "Sent Successfully";
		}
		catch(Exception e) {
			return "Error"+e.getMessage();
		}
	}

}
