package com.bookshop01.mail.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailService {
	@Autowired
	 private JavaMailSender mailSender;
//    @Autowired
//    private SimpleMailMessage preConfiguredMessage;
 
    @Async
	public void sendMail(String to, String subject, String body) {
      MimeMessage message = mailSender.createMimeMessage();
      try {
		MimeMessageHelper messageHelper = 
		new MimeMessageHelper(message, true, "UTF-8");
		//messageHelper.setCc("zzzzzz@naver.com");
		messageHelper.setFrom("qkr5759@naver.com", "박철순");
		messageHelper.setSubject(subject);
		messageHelper.setTo(to); 
		messageHelper.setText(body );
		mailSender.send(message);  
      }catch(Exception e){
		e.printStackTrace();
	  }
	}
 
}

