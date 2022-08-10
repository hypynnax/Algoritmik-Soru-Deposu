package uygunsifre;

import java.util.Scanner;

public class UygunSifre {

    static byte uzunluk(String kelime) {
        byte kontrol = 0;
        if (kelime.length() >= 8) {
            kontrol += 1;
        } else {
            System.out.println("Lütfen en az 8 karekter uzunluğunda bir şifre girin");
        }
        return kontrol;
    }

    static byte karekterKontrol(String kelime) {
        byte kontrol = 0;
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 48; j < 58; j++) {
                if ((int) kelime.charAt(i) == j) {
                    kontrol += 1;
                }
            }
        }
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 65; j < 91; j++) {
                if ((int) kelime.charAt(i) == j) {
                    kontrol += 1;
                }
            }
        }
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 97; j < 123; j++) {
                if ((int) kelime.charAt(i) == j) {
                    kontrol += 1;
                }
            }
        }
        if (kontrol == kelime.length()) {
            kontrol = 1;
        } else {
            System.out.println("Lütfen yanlızca sayı veya harflerden oluşan bir şifre girin");
            kontrol = 0;
        }
        return kontrol;
    }

    static byte ikiSayiKontrol(String kelime) {
        byte kontrol = 0;
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 48; j < 58; j++) {
                if ((int) kelime.charAt(i) == j) {
                    kontrol += 1;
                }
            }
        }
        if (kontrol >= 2) {
            kontrol = 2;
        } else {
            System.out.println("Lütfen en az iki sayı içeren bir şifre giriniz");
        }
        return kontrol;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen bir porola girin:");
        String sifre = reader.nextLine();
        int kontrol = uzunluk(sifre) + karekterKontrol(sifre) + ikiSayiKontrol(sifre);
        if (kontrol >= 4) {
            System.out.println("Geçerli şifre\nGiriş Başarılı");
        }
    }
}
