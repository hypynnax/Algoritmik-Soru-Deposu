package kalorihesaplama;

import java.util.Scanner;

public class KaloriHesaplama {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Cinsiyet giriniz: ");
        String cinsiyet = reader.nextLine();
        System.out.print("Adım sayısını giriniz: ");
        int adimSayisi = reader.nextInt();
        int kalori;
        if (cinsiyet.equals("kadin")) {
            kalori = adimSayisi * 30 / 500;
        } else {
            kalori = adimSayisi * 45 / 500;
        }
        System.out.println("Yakılan kalori miktarı:" + kalori);
    }
}
