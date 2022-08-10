package makinecalismasuresi;

import java.util.Scanner;

public class MakineCalismaSuresi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen makina sayısını giriniz: ");
        int makineSayisi = reader.nextInt();
        System.out.print("Lütfen hangi ayda olduğunuzu giriniz: ");
        int ay = reader.nextInt();

        int sure, aralik;
        if (ay > 2 && ay < 9) {
            sure = 480;
            aralik = 45;
        } else {
            sure = 540;
            aralik = 30;
        }
        for (int i = makineSayisi; i > 0; i--) {
            System.out.print(sure + ",");
            sure = sure - aralik;
        }
    }
}
