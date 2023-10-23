package snacks.java;
//Snack 6
//Scrivere un programma che dati dei secondi li converta in ore,
// minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        int totaleSecondi = scanner.nextInt();

        int ore = totaleSecondi / 3600;
        int minuti = (totaleSecondi % 3600) / 60;
        int secondi = totaleSecondi % 60;

        String tempoFormat = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        System.out.println("Tempo convertito: " + tempoFormat);

        scanner.close();
    }
}
