package info.testengineer.mock;


import org.subethamail.smtp.TooMuchDataException;
import org.subethamail.smtp.helper.SimpleMessageListener;
import org.subethamail.smtp.helper.SimpleMessageListenerAdapter;
import org.subethamail.smtp.server.SMTPServer;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * The type Mock email service.
 */
public class MockEmailService {

    /**
     * The private value smtpServer.
     */
    private SMTPServer smtpServer;

    /**
     * The private value messages.
     */
    private final List<String> messages = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MockEmailService() {
        super();
        //empty
        return;
    }

    /**
     * Start.
     */
    public void start() {

        final int port = 9010;
        smtpServer = new SMTPServer(new SimpleMessageListenerAdapter(new SimpleMessageListener() {
            @Override
            public boolean accept(final String from, final String recipient) {
                return true;
            }

            @Override
            public void deliver(final String from, final String recipient, final InputStream data) throws TooMuchDataException, IOException {

                try {
                    final MimeMessage mimeMessage = new MimeMessage(Session.getDefaultInstance(new Properties()), data);
                    messages.add((String) mimeMessage.getContent());
                } catch (MessagingException ex) {
                    throw new RuntimeException(" Failed to read messge from " + from + " to " + recipient, ex);
                }

            }
        }));

        smtpServer.setPort(port);
        smtpServer.start();

    }

    /**
     * Tear down.
     */
    public void stop() {
        if (smtpServer != null) {
            smtpServer.stop();
        }

    }

}
