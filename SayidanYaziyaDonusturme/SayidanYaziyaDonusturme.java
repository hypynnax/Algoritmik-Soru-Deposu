package sayidanyaziyadonusturme;

import java.util.Scanner;

public class SayidanYaziyaDonusturme {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("1-99 arası bir sayı giriniz: ");
        int sayi = reader.nextInt();
        String[] birler = {"Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        String[] onlar = {"On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};
        int onlarbasamagi = sayi / 10;
        int birlerbasamagi = sayi % 10;
        for (int i = 0; i < 9; i++) {
            if (onlarbasamagi == i + 1) {
                System.out.print(onlar[i] + " ");
            }
        }
        for (int i = 0; i <= 8; i++) {
            if (birlerbasamagi == i + 1) {
                System.out.println(birler[i]);
            }
        }
    }
}
