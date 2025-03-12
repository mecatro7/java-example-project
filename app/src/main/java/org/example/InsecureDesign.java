// Insecure Design (A04:2021)
public class InsecureDesign {
    public void processPayment(String cardNumber, String cvv) {
        System.out.println("card number: " + cardNumber + ", CVV: " + cvv);
    }
}