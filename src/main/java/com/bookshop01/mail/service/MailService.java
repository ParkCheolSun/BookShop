package com.bookshop01.mail.service;

public interface MailService {
	public void sendMail(String to, String subject, String body);
	public void sendPreConfiguredMail(String message);
}
