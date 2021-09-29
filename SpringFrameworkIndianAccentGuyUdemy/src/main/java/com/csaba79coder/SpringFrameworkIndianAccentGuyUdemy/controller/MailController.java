package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.controller;

import com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email.MailSender;
// import com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.email.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    // needed dependency injection as in production they use SMTP mail sender, developer uses Mock ... (just for test)
    // component help for dependency injection to change smtp mail sender and mock mail sender regarding who uses it! - pair Autowired!
    //  // for duplication of @Component needed a @Qualifier to avoid the warning message, and to make program runnable!
    // if I use qualifier no matter if something has @Primary annotation!
    @Qualifier("smtpMailSender")
    @Autowired // this can be @Autowired or also a setter of it can be @Autowired! and also works with constructor!
    // private MailSender mailSender = new MockMailSender();
    private MailSender mailSender;

//    public MailSender getMailSender() {
//        return mailSender;
//    }

    // if you use both Component as annotation change the mailSender to smtp or to mock (depends which you wanna use!)
    public void setMailSender(@Qualifier("smtpMailSender") MailSender mailSender) {
        this.mailSender = mailSender;
    }

//    // This one used before the Qualifier and with the Primary annotation!
//    public void setMailSender(MailSender smtpMailSender) {
//        this.mailSender = smtpMailSender;
//    }

    // instead of this one use the above mentioned one!
//    public void setMailSender(MailSender mailSender) {
//        this.mailSender = mailSender;
//    }

    @RequestMapping("/mail")
    public String mail() {

        mailSender.send("mail@example.com", "A test mail", "Body of the test mail!");
        // mailSender.send("csabavadasz79@gmail.com", "first test email", "I learnt it at UDEMY!!!");
        return "Mail sent!";
    }
}
