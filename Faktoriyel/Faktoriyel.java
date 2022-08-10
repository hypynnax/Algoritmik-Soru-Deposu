package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    public static int faktoriyel(int sayi) {
        if (sayi <= 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = reader.nextInt();

        System.out.println(sayi + " sayısının faktöriyeli = " + faktoriyel(sayi));
    }
}
