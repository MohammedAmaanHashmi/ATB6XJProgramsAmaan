package may.ex_21052024.abstraction.abstractkeyword.REALEx;

abstract class BaseClass {

    //Web Automation
    //Single Inheritance - Baseclass -> child 1,
    // Baseclass -> child 2

    abstract String openBrowser();

    abstract String closeBrowser();

    void printLog() {
        System.out.println("Logs");
    }
}
