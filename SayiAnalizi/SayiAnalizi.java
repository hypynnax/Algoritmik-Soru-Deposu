package sayianalizi;

import java.util.Scanner;

public class SayiAnalizi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = reader.nextInt();
        int tekrakamlartoplami = 0;
        int ciftrakamlartoplami = 0;
        int tekrakamlarsayisi = 0;
        int ciftrakamlarsayisi = 0;
        while (sayi != 0) {
            int kalan = sayi % 10;
            sayi = sayi / 10;
            if (kalan % 2 == 0) {
                ciftrakamlartoplami = ciftrakamlartoplami + kalan;
                ciftrakamlarsayisi++;
            } else {
                tekrakamlartoplami = tekrakamlartoplami + kalan;
                tekrakamlarsayisi++;
            }
        }
        System.out.println("Basamak sayısı:" + (tekrakamlarsayisi + ciftrakamlarsayisi));
        System.out.println("Tek rakamların toplamı:" + tekrakamlartoplami);
        System.out.println("Çift rakamların toplamı:" + ciftrakamlartoplami);
        System.out.println("Tek ve çift rakamların farklarının mutlak değeri:" + Math.abs(tekrakamlartoplami - ciftrakamlartoplami));
    }
}
