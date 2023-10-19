package snacks.java;

import java.util.Random;

//Snack2
// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
// e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {
        String[] name = {"Stefania", "Daisy", "Tom", "Rosario", "Luis", "Nick", "George", "Lucille", "luca", "Rayan"};
        String[] surname = {"Gatsby", "Sarmiento", "Portoghese", "Baker", "McKee", "Zapata", "Rossi", "Constantine", "Wolfe", "Hotico"};

        int numberOfGuests = 5;

        Random random = new Random();

        System.out.println("List of guests: 👨👩");

        for (int i = 0; i < numberOfGuests; i++) {
            String randomName = name[random.nextInt(name.length)];
            String randomSurname = surname[random.nextInt(surname.length)];
            System.out.println(randomName + " " + randomSurname);
        }

    }
}
