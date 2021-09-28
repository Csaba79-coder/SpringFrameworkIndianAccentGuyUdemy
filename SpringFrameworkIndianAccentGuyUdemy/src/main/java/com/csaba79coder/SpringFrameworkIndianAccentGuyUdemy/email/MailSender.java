package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

public interface MailSender {

    void send(String email, String subject, String body);
}
