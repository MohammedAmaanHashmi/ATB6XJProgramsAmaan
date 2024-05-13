package april.ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {

        //Web Automation
        //I will ask user which browser you want me to run the code.
        //chrome -> start chrome, firefox -> firefox -, edge -> execution edge.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program");

        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch (browserName) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                //Further code to start the chrome
                //Webdriver driver=new ChromeDriver();
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                //Further code to start the firefox
                //Webdriver driver=new Firefox();
                break;

            case "edge":
                System.out.println("Starting the Edge");
                //Further code to start the firefox
                //Webdriver driver=new Edge();
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break; //This is optional
        }
    }
}
