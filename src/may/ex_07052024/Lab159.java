package may.ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        //Web Automation
        openBrowser();
        testLoginPage1();
        testLoginPage("page 1");
        closeBrowser();

        openBrowser();
        testLoginPage1();
        closeBrowser();

        openBrowser();
        testLoginPage("page 1");
        closeBrowser();

    }

    static void openBrowser() {
        System.out.println("Chrome Browser Opened");
    }

    static void closeBrowser() {
        System.out.println("Chrome Browser is closed");
    }

    static void testLoginPage1() {
        System.out.println("Chrome Browser Opened");
    }

    static void testLoginPage(String page) {
        System.out.println("Testing ->" + page);
    }


}
