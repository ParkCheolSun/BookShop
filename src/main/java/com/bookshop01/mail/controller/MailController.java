package com.bookshop01.mail.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MailController {
	public void sendSimpleMail(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
