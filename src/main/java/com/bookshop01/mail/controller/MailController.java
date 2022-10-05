package com.bookshop01.mail.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookshop01.mail.service.MailService;

@Controller("emailController")
@RequestMapping(value="/email")
@EnableAsync
public class MailController {
    @Autowired
    private MailService mailService;
 
    //@Override
	@RequestMapping(value="/emailCheck.do" ,method = RequestMethod.POST)
    public ResponseEntity sendSimpleMail(@RequestParam("email") String email, HttpServletRequest request, HttpServletResponse response) 
                                                          throws Exception{
    	ResponseEntity resEntity = null;
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String temp = "abc";
        mailService.sendMail("qkr5759@naver.com","BookShop 인증메일","인증번호 : " + temp);
        out.print("메일을 보냈습니다!");
        
        
		String result = "Success";
		resEntity =new ResponseEntity(result, HttpStatus.OK);
		return resEntity;
    }
}
