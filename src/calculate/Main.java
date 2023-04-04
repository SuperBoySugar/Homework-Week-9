package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        char ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int a = scan.nextInt();
            System.out.println("Enter Second Number: ");
            int b = scan.nextInt();

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Please enter one of symbol +,-,*,/: ");
            String str = scan1.nextLine();

            char symbol = str.charAt(0); // converting string to char
            scan.close();

            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter \"Y\" or \"N\": ");
            String str1 = scan1.nextLine();
            ch = str1.charAt(0);

        } while (ch == 'Y' || ch == 'Y');

    }
}