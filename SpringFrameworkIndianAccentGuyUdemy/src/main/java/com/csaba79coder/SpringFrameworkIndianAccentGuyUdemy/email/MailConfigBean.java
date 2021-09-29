package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
// @Component
public class MailConfigBean {

    @Bean
    @Profile("dev")
    @ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing = true)
    public MailSender mockMailSenderBean() {
        return new MockMailSenderBean();
    }

    @Bean
    @Profile("prod") // @Profile("!dev") // this is also good!
    @ConditionalOnProperty("spring.mail.host") // for using smtp gmail host from application.properties!
    public MailSender smtpMailSenderBean() {
        return new SmtpMailSenderBean();
    }
}
