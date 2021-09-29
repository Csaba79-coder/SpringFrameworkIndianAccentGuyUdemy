package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component //only this one or only the other one can  be Component at one time!
public class SmtpMailSender implements MailSender {

    // private static final ILoggerFactory LOG = (ILoggerFactory) name -> null;
    private static final Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String email, String subject, String body) {
        // as we are sending a mock email, all the info goes to a log!!!

        log.info("Sending SMTP email to: " + email);
        log.info("With subject: " + subject);
        log.info("and body " + body);
    }
}
