package may.ex_14052024;

public class BankCount {
    String bankName;
    int balance;
    String bankCode;

    public BankCount(String bankName, int balance, String bankCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public BankCount(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    BankCount() {
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    public void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal -> " + balance);
    }
}
