package Assignments.OOPS;

public class Payment {

    String bankName;
    String paymentType;
    double amount;

    public Payment(String bankName, String paymentType,double amount) {
        this.bankName = bankName;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public void printBankNameAndPaymentType() {
        System.out.println("payment Type is " + bankName);
        System.out.println("payment Type is " + paymentType);
        System.out.println("payment amount is " + amount);
    }
}
