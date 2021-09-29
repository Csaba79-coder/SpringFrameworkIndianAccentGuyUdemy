package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
// @Component
public class MailConfigBean {

    @Bean
    @Profile("dev")
    public MailSender mockMailSenderBean() {
        return new MockMailSenderBean();
    }

    @Bean
    @Profile("prod") // @Profile("!dev") // this is also good!
    public MailSender smtpMailSenderBean() {
        return new SmtpMailSenderBean();
    }
}
