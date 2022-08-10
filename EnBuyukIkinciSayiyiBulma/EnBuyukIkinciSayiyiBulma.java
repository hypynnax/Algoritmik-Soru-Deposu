package enbuyukıkincisayiyibulma;

import java.util.Scanner;

public class EnBuyukIkinciSayiyiBulma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int enBuyuk, enBuyukIkinci = 0;
        System.out.print("Bir sayi girin: ");
        int sayi = reader.nextInt();
        enBuyuk = sayi;

        for (int i = 1; i < 5; i++) {
            System.out.print("Bir sayi girin: ");
            sayi = reader.nextInt();
            if (sayi > enBuyuk) {
                enBuyukIkinci = enBuyuk;
                enBuyuk = sayi;
            } else if (sayi > enBuyukIkinci) {
                enBuyukIkinci = sayi;
            }
        }
        System.out.println("En büyük 2. sayi " + enBuyukIkinci);
    }
}
