package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail () {
        emailService.sendEmail("st10715031@gmail.com",
                "Its Life Test Wont Be Easy",
                "Hey Champ Its Just A Phase Dont Give Up " +
                        "God Is Protecting You ");
    }
}
