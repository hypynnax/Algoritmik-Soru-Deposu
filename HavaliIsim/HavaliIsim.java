package havaliısim;

import java.util.Scanner;

public class HavaliIsim {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz: ");
        String ad = reader.next();
        String soyad = reader.next();

        //Ad 12 den küçük ise uzunluğu 12 olana dek * eklemesi için gereken döngü
        if (ad.length() < 12) {
            for (int i = ad.length(); i < 12; i++) {
                ad += "*";
            }
        }

        //Soyad 12 den küçük ise uzunluğu 12 olana dek + eklemesi için gereken döngü
        if (soyad.length() < 12) {
            for (int i = soyad.length(); i < 12; i++) {
                soyad += "+";
            }
        }
        //Adı kare şeklinde yazmak için gerekli kodlar
        System.out.println(ad.substring(0, 4) + " ");
        System.out.println(ad.charAt(4) + "  " + ad.charAt(11) + " ");
        System.out.println(ad.charAt(5) + "  " + ad.charAt(10) + " ");
        System.out.println(ad.substring(6, 10) + " ");

        //Soyadı U şeklinde yazmak için gerekli kodlar
        System.out.println(soyad.charAt(0) + "    " + soyad.charAt(11));
        System.out.println(soyad.charAt(1) + "    " + soyad.charAt(10));
        System.out.println(soyad.charAt(2) + "    " + soyad.charAt(9));
        System.out.println(soyad.substring(3, 9));
    }
}
