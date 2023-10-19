package snacks.java;
//Snack4
//Data in input una stringa verificare se è palindroma

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check if the string is a palindrome");

        System.out.print("writes a string: ");
        String wordString = scanner.nextLine();

        String stringWithoutSpaces = wordString.replaceAll("\\s", "").toLowerCase();

        boolean palindrome = true;

        int lengthString = stringWithoutSpaces.length();

        for (int i = 0; i < lengthString / 2; i++) {
            if (stringWithoutSpaces.charAt(i) != stringWithoutSpaces.charAt(lengthString - i - 1)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


    }
}
