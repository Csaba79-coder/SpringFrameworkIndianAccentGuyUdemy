package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// @Component
public class MailConfigBean {

    @Bean
    public MailSender mockMailSenderBean() {
        return new MockMailSenderBean();
    }

    @Bean
    public MailSender smtpMailSenderBean() {
        return new SmtpMailSenderBean();
    }
}
