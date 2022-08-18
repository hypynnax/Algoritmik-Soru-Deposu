package collatzproblemi;

import java.util.Scanner;

public class CollatzProblemi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = reader.nextInt();
        while (sayi > 1) {
            System.out.print(sayi + " ");
            if (sayi % 2 == 0) {
                sayi /= 2;
            } else {
                sayi = 3 * sayi + 1;
            }
        }
        System.out.println("1");
    }
}
