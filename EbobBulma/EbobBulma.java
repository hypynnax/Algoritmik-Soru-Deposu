package ebobbulma;

import java.util.Scanner;

public class EbobBulma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin : ");
        int birinciSayi = reader.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int ikinciSayi = reader.nextInt();
        int ebob = Integer.min(birinciSayi, ikinciSayi);
        while (ebob <= Integer.max(birinciSayi, ikinciSayi)) {
            if (birinciSayi % ebob == 0 && ikinciSayi % ebob == 0) {
                System.out.println(birinciSayi + " ve " + ikinciSayi + " sayılarının ebobu : " + ebob);
                return;
            } else {
                ebob++;
            }
        }
        System.out.println(birinciSayi + " ve " + ikinciSayi + " sayıları aralarında asaldır.");
    }
}
