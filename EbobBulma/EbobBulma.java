package ebobbulma;

import java.util.Scanner;

public class EbobBulma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin : ");
        int birinciSayi = reader.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int ikinciSayi = reader.nextInt();
        int bolen = 2, ebob = 1;
        while (bolen <= Integer.min(birinciSayi, ikinciSayi)) {
            if (birinciSayi % bolen == 0 && ikinciSayi % bolen == 0) {
                ebob = bolen;
            }
	    bolen += 1;
        }
        if (ebob == 1) {
            System.out.println(birinciSayi + " ve " + ikinciSayi + " aralarında asal");
        } else {
            System.out.println(ebob);
        }
    }
}
