package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// component help for dependency injection to change smtp mail sender and mock mail sender regarding who uses it! - pair is Autowired!
@Component
// if we have no @Component annotation here, we can create a MailConfig class!!! ...
@Primary // makes the injection primary! -- removing Primary annotation to try the Qualifier!
public class MockMailSender implements MailSender {

    // private static final ILoggerFactory LOG = (ILoggerFactory) name -> null;
    private static final Log LOG = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String email, String subject, String body) {
        // as we are sending a mock email, all the info goes to a log!!!

        LOG.info("Sending MOCK email to: " + email);
        LOG.info("With subject: " + subject);
        LOG.info("and body " + body);
    }
}
