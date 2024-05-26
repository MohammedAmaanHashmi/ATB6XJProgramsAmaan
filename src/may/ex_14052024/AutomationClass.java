package may.ex_14052024;

public class AutomationClass {

    String name;

    AutomationClass() {
        dataBaseConnection();
        excelOpen();
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void dataBaseConnection() {
        System.out.println("Mysql connection is created");
    }

    void excelOpen() {
        System.out.println("Excel Opened");
    }

    void test1() {
        System.out.println("testCase1" + this.name);
    }

    void test2() {
        System.out.println("testCase1" + this.name);
    }

    public static void main(String[] args) {
        AutomationClass tc1 = new AutomationClass("TC1");
        AutomationClass tc2 = new AutomationClass("TC2");
        System.out.println(tc1.name);
        tc1.test1();
        tc2.test2();

        System.out.println(tc2.name);
        tc1.test1();
        tc2.test2();

    }
}
