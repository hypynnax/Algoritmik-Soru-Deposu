package taskagitmakas;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    public static void main(String[] args) {
        Random rastgele = new Random();
        int bilgisayar = 1 + rastgele.nextInt(3);
        System.out.println("1) ♖");
        System.out.println("2) #");
        System.out.println("3) ✂");
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir icon seçin: ");
        int oyuncu = reader.nextInt();
        for (;;) {
            if (oyuncu == 1 && bilgisayar == 2) {
                System.out.println("Kağıt Taşı Sarar");
                System.out.println("KAYBETTİN");
                break;

            } else if (oyuncu == 1 && bilgisayar == 3) {
                System.out.println("Taş Makası Kırar");
                System.out.println("KAZANDIN");
                break;

            } else if (oyuncu == 2 && bilgisayar == 1) {
                System.out.println("Kağıt Taşı Sarar");
                System.out.println("KAZANDIN");
                break;

            } else if (oyuncu == 2 && bilgisayar == 3) {
                System.out.println("Makas Kağıdı Keser");
                System.out.println("KAYBETTİN");
                break;

            } else if (oyuncu == 3 && bilgisayar == 1) {
                System.out.println("Taş Makası Kırar");
                System.out.println("KAYBETTİN");
                break;

            } else if (oyuncu == 3 && bilgisayar == 2) {
                System.out.println("Makas Kağıdı Keser");
                System.out.println("KAZANDIN");
                break;

            } else {
                System.out.println("BERABERE");
                break;
            }
        }
    }
}
