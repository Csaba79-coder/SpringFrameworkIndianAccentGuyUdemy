package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

// component help for dependency injection to change smtp mail sender and mock mail sender regarding who uses it! - pair is Autowired!
@Component
public class MockMailSender implements MailSender {

    // private static final ILoggerFactory LOG = (ILoggerFactory) name -> null;
    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String email, String subject, String body) {
        // as we are sending a mock email, all the info goes to a log!!!

        log.info("Sending mock email to: " + email);
        log.info("With subject: " + subject);
        log.info("and body " + body);
    }
}
