package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import com.fasterxml.jackson.databind.ext.Java7Handlers;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Configuration // DemoBean created only once it is visible in log!
// @Component // in this DemoBean created twice after each other!
public class BeanConfig {

    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

    // down bellow it's an overload!!! the two methods are only different in the parameters in method!!!
    @Bean
    @Profile("prod") //
    @ConditionalOnProperty("spring.mail.host") // for using smtp gmail host from application.properties!
    // you can inject bean here in constructor, or you can just call the method!
    public MailSender smtpMailSenderBean(JavaMailSender javaMailSender, DemoBean demoBean) {
        return new SmtpMailSenderBean(javaMailSender, demoBean);
    }

    @Bean
    @Profile("prod") //
    @ConditionalOnProperty("spring.mail.host") // for using smtp gmail host from application.properties!
    // you can inject bean here in constructor, or you can just call the method!
    public MailSender smtpMailSenderBean(JavaMailSender javaMailSender) {
        demoBean();
        return new SmtpMailSenderBean(javaMailSender);
    }

}
