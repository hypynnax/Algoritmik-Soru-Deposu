package metinsifreleme;

import java.util.Scanner;

public class MetinSifreleme {

    static void sifreleme(String metin, int sifrelemeKodu) {
        String sifrelenmisMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            int karakter = metin.charAt(i) + sifrelemeKodu;
            sifrelenmisMetin += (char) karakter;
        }
        System.out.println(sifrelenmisMetin);
    }

    static void sifreCozme(String metin, int sifrelemeKodu) {
        String sifresiCozulmusMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            int karakter = metin.charAt(i) - sifrelemeKodu;
            sifresiCozulmusMetin += (char) karakter;
        }
        System.out.println(sifresiCozulmusMetin);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi girin : ");
        String islem = reader.nextLine();
        System.out.print("Şifreleme kodunu girin : ");
        int sifrelemeKodu = reader.nextInt();
        reader.nextLine();
        System.out.print('Ş' + islem.substring(1, islem.length()) + " yapılacak metni girin : ");
        String metin = reader.nextLine();
        if (islem.toLowerCase().equals("sifreleme")) {
            sifreleme(metin, sifrelemeKodu);
        } else if (islem.toLowerCase().equals("sifre cozme")) {
            sifreCozme(metin, sifrelemeKodu);
        } else {
            System.out.println("Ya şifreleme yapabilirsiniz\nYa da şifre çözme yapabilirsiniz");
        }
    }
}
