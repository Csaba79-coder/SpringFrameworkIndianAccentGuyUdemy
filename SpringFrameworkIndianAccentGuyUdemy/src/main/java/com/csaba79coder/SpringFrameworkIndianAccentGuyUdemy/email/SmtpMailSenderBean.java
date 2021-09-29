package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpMailSenderBean implements MailSender{

    private static final Log LOG = LogFactory.getLog(SmtpMailSenderBean.class);

    public SmtpMailSenderBean(JavaMailSender javaMailSender, DemoBean demoBean) {
    }

    public SmtpMailSenderBean() {
    }

    public SmtpMailSenderBean(JavaMailSender javaMailSender) {

    }

    @Override
    public void send(String email, String subject, String body) {
        LOG.info("Sending SMTP email to: " + email);
        LOG.info("With subject: " + subject);
        LOG.info("and body " + body);
    }
}
