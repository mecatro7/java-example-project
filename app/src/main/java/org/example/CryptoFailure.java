import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


//Cryptographic Failures (A02:2021) - weak hashing function
public class CryptoFailure {
    public String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest(password.getBytes());
        return bytes.toString();
    }
}