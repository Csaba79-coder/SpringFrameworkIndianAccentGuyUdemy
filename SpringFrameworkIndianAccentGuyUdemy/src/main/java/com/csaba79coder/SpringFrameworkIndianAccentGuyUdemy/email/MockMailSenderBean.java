package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSenderBean implements MailSender {

    private static final Log LOG = LogFactory.getLog(MockMailSenderBean.class);

    @Override
    public void send(String email, String subject, String body) {

        LOG.info("Sending MOCK email to: " + email);
        LOG.info("With subject: " + subject);
        LOG.info("and body " + body);
    }
}
