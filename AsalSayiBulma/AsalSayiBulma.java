package asalsayibulma;

import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayı girin: ");
        int sayi = reader.nextInt();
        boolean kontrol;
        if (sayi > 2) {
            System.out.print("2");
        }
        for (int i = 3; i < sayi; i++) {
            kontrol = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = true;
                    break;
                }
            }
            if (kontrol == false) {
                System.out.print("," + i);
            }
        }
        System.out.println("");
    }
}
