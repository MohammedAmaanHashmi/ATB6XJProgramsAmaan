package may.ex_16052024.multilevelInheritance.apiAutomation;

public class Test extends BaseTest {

    void accessExcelAndSQL() {
        OpenExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }
    void openJSon() {
        System.out.println("Test");
    }
}
