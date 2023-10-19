package snacks.java;
//Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class Snack3 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            if (i % 2 != 0) {
                sum += number[i];
            }
        }
        System.out.println("The sum of the numbers in odd positions is: " + sum);
    }
}
