package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.controller;

import com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MailControllerBean {

    // @Autowired
    private MailSender mailSender;

    // @Primary
    // @RequestMapping("/mailBean")
    public String mail() {

        mailSender.send("mail@example.com", "A test mail Bean", "Body of the test mail with BEAN annotation!");
        // mailSender.send("csabavadasz79@gmail.com", "first test email", "I learnt it at UDEMY!!!");
        return "Mail sent!";
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }
}
