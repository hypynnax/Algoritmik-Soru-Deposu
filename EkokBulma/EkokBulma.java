package ekokbulma;

import java.util.Scanner;

public class EkokBulma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin : ");
        int birinciSayi = reader.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int ikinciSayi = reader.nextInt();
        int ekok = Integer.max(birinciSayi, ikinciSayi);
        while (ekok <= birinciSayi * ikinciSayi) {
            if (ekok % birinciSayi == 0 && ekok % ikinciSayi == 0) {
                System.out.println(birinciSayi + " ve " + ikinciSayi + " sayılarının ebobu : " + ekok);
                return;
            } else {
                ekok++;
            }
        }
    }
}
