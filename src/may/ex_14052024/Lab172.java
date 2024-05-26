package may.ex_14052024;

public class Lab172 {
    public static void main(String[] args) {
        BankCount sbi_ref = new BankCount();
        sbi_ref.printDetails();

        System.out.println("-------------------");

        BankCount hdfc_ref = new BankCount("HDFC", 10, "HDFC001");
        hdfc_ref.printDetails();

        System.out.println("-------------------");
        BankCount icici_ref = new BankCount("ICICI", 20, "ICICI003");
        icici_ref.printDetails();

        System.out.println("-------------------");
        BankCount yes_ref = new BankCount("YES", "YES005");
        yes_ref.printDetails();
    }
}
