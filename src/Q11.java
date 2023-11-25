public class CreditCard {
    // instance variables
    private String customerName;
    private String cardNumber;
    private double creditLimit;
    private double balance;

    // constructor
    public CreditCard(String customerName, String cardNumber, double creditLimit) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    // method to update the credit limit
    public void updateCreditLimit(double newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

}