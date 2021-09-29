package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.controller;

import com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email.MailSender;
// import com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    // needed dependency injection as in production they use SMTP mail sender, developer uses Mock ... (just for test)
    // component help for dependency injection to change smtp mail sender and mock mail sender regarding who uses it! - pair Autowired!
    @Autowired
    // private MailSender mailSender = new MockMailSender();
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail() {

        mailSender.send("mail@example.com", "A test mail", "Body of the test mail!");
        mailSender.send("csabavadasz79@gmail.com", "first test email", "I learnt it at UDEMY!!!");
        return "Mail sent!";
    }
}
