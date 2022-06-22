package mayintarlasi;

import java.util.Scanner;

public class MayinTarlasi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen oyun alanının enini giriniz: ");
        int en = reader.nextInt();
        System.out.print("Lütfen oyun alanının boyunu giriniz: ");
        int boy = reader.nextInt();
        int puan = 0;
        int[][] tarla = new int[boy][en];
        for (int i = 0; i < boy; i++) {
            for (int j = 0; j < en; j++) {
                int bomba = (int) (Math.random() * 2);
                tarla[i][j] = bomba;
            }
        }
        System.out.print("Seçmek istediğiniz yerin koordinatlarını yazınız: ");
        for (;;) {
            int satir = reader.nextInt();
            int sutun = reader.nextInt();
            if (tarla[satir][sutun] == 1) {
                System.out.println("Game Over!!\nPuanınız : " + puan);
                break;
            }
            puan += 10;
            System.out.println("HALA HAYATTASIN...Devam\n10 puan kazanıldı");
            System.out.print("Hadi bir koordinat daha yaz: ");
        }
    }
}
