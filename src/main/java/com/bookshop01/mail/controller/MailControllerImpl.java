package com.bookshop01.mail.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookshop01.mail.service.MailServiceImpl;

//@Controller
@EnableAsync
public class MailControllerImpl implements MailController{
    @Autowired
    private MailServiceImpl mailService;
 
    //@RequestMapping(value = "/sendMail.do", method = RequestMethod.GET)
    public void sendSimpleMail(HttpServletRequest request, HttpServletResponse response) 
                                                          throws Exception{
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String temp = "abc";
        mailService.sendMail("qkr5759@naver.com","BookShop 인증메일","인증번호 : " + temp);
        mailService.sendPreConfiguredMail("테스트 메일");
        out.print("메일을 보냈습니다!");
    }
}
