package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Configuration
//@Component  // this can be also been a Bean!
public class MailConfig {

    // @Bean
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    // Bean
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
}
