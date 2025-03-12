// Security Misconfiguration (A05:2021)
import java.util.Properties;

public class MisconfigurationExample {
    public void sendEmail(String to, String message) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.example.com");
    }
}
