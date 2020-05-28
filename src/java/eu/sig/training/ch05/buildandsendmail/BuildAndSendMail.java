package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, MailAddress mAddress,
            MailBody mBody) {
        // Build the mail
        Mail mail = new Mail(mAddress, mBody);
        // Send the mail
        m.send(mail);
        
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(Mail mail) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}