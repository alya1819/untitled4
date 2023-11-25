public class CreditCard{
    private String cardNumber;
    private double balance;

    // constructor
    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    // other methods

    public void makePayment(double amount) {
        if (amount >= 0) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " processed. New balance: $" + balance);
        } else {
            System.out.println("Invalid payment amount. Payment amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    // other methods
}