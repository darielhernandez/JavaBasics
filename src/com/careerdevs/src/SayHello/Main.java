package SayHello;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        whatIsYourName();
//        yourFullNameSon()

    }
    public static void whatIsYourName(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your name?");
        String userName= scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ userName);
    }

    public static void yourFullNameSon(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("First name?");
        String firstName= scanner.nextLine();
        System.out.println("Last name?");
        String lastName= scanner.nextLine();

        System.out.println("Pleased to meet you, "+firstName+" "+lastName);



    }

}
