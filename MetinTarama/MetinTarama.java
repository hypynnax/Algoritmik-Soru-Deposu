package metintarama;

import java.util.Scanner;

public class MetinTarama {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Tarama yapmak istediğiniz metni girin: ");
        String metin = reader.nextLine();
        System.out.print("Arama yapmak istediğiniz kelimeyi girin: ");
        String kelime = reader.nextLine();
        int parca = kelime.length();
        int tekrar = metin.length();
        int tekrarSayisi = 0;
        for (int i = 0; i < tekrar; i++) {
            String kontrol = metin.substring(i, i + parca);
            if (kontrol.equals(kelime)) {
                tekrarSayisi += 1;
                System.out.println("Aranan kelime " + (i + 1) + ". harften başlıyor");
            }
        }
        System.out.println("Tüm metinde "+tekrarSayisi+" defa geçmektedir.");
    }
}
