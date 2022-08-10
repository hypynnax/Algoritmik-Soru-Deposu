package sinavsonucu;

import java.util.Scanner;

public class SinavSonucu {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sınavın kaç soruluk olduğunu yazın : ");
        int soruSayisi = reader.nextInt();
        System.out.print("Sınava giren öğrenci sayısını yazın : ");
        int ogrenciSayisi = reader.nextInt();
        char[][] ogrenciCevaplari = new char[ogrenciSayisi][soruSayisi];
        ogrenciCevaplariniHazirlama(ogrenciCevaplari);
        char[] cevapKagadi = new char[soruSayisi];
        cevapKagadiniHazirlama(cevapKagadi);
        sinaviDegerlendirme(cevapKagadi, ogrenciCevaplari);

    }

    static void sinaviDegerlendirme(char[] cevapKagadi, char[][] ogrenciCevaplari) {
        for (int i = 0; i < ogrenciCevaplari.length; i++) {
            int dogruSayisi = 0, yanlisSayisi = 0;
            double puan = 0;
            for (int j = 0; j < ogrenciCevaplari[0].length; j++) {
                if (ogrenciCevaplari[i][j] == cevapKagadi[j]) {
                    dogruSayisi++;
                } else {
                    yanlisSayisi++;
                }
            }
            puan = dogruSayisi * 100d / cevapKagadi.length;
            System.out.println(i + 1 + ". öğrencinin " + dogruSayisi + " tane doğru, " + yanlisSayisi + " tane yanlış cevabı var.");
            System.out.printf("PUAN : %.2f\n", puan);
        }
    }

    static void cevapKagadiniHazirlama(char[] cevaplar) {
        for (int i = 0; i < cevaplar.length; i++) {
            int cevap = (int) (Math.random() * 5 + 65);
            cevaplar[i] = (char) cevap;
        }
    }

    static void ogrenciCevaplariniHazirlama(char[][] ogrenciCevaplari) {
        for (int i = 0; i < ogrenciCevaplari.length; i++) {
            for (int j = 0; j < ogrenciCevaplari[0].length; j++) {
                int cevap = (int) (Math.random() * 5 + 65);
                ogrenciCevaplari[i][j] = (char) cevap;
            }
        }
    }
}
