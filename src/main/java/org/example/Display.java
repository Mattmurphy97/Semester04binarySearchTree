package org.example;

public class Display {

    // CLI output stored here to try and keep Main class cleaner
    public static void div(){
        System.out.println("----------------------------------------------");
    }

    public static void header() {
        System.out.println("----------------------------------------------");
        System.out.println("------------Binary Search Tree Demo-----------");
        System.out.println("----------------------------------------------");
        System.out.println();
    }

    public static void mainMenu() {
        System.out.println("Array of data created as int[100]");
        System.out.print("Please Enter your target value between 0-99: ");
    }

    public static void taskComplete01() {
        System.out.println("Check Array For Different Target Value? ");
        System.out.println("1) Yes, Check New Target Value");
        System.out.println("2) No, End Program");
        System.out.print("Select: ");
    }
    public static void goodbye() {
        System.out.println("Goodbye!");
    }

}
