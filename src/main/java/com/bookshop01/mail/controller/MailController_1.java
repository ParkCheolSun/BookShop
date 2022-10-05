package com.bookshop01.mail.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface MailController_1 {
	public ResponseEntity sendSimpleMail(@RequestParam("email") String email, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
