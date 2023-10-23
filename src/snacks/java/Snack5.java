package snacks.java;

import java.util.Scanner;

//Snack5
//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//Possibile usare solo :
//cicli
//chartAt
//if / switch
//Es. “25" come stringa deve essere convertito in intero 25.
public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        String numberString = scanner.nextLine();

        int result = 0;
        int numberLength = numberString.length();
        System.out.println(numberLength);

        for (int i = 0; i < numberLength; i++) {
            char character = numberString.charAt(i);

            if (character >= '0' && character <= '9') {
                int figure = character - '0';
                result = result * 10 + figure;
            } else {
                System.out.println("The String contains non numeric characters");
                return;
            }
        }

        System.out.println("the number exchange is: " + result);

        scanner.close();

    }
}
