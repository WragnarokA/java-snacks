package snacks.java;

import java.util.Scanner;

//Snack1
// Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
// Se il numero è negativo termina.
public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (negative number to end): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("You entered a number negative. The program ends 🎉🎉🎉");
                break;
            } else if (number % 2 == 0) {
                System.out.println("The number is even: " + number);
            } else {
                System.out.println("The number is odd, this is the next one: " + (number + 1));
            }
        }
        scanner.close();
    }
}
