package sayitahmini;

import java.util.Scanner;

public class SayiTahmini {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int bilgisayar = (int) (Math.random() * 10 + 1);
        System.out.print("Bir tamsayı giriniz(1-10): ");
        int adim = 0;
        for (;;) {
            int oyuncu = reader.nextInt();
            if (oyuncu > bilgisayar) {
                System.out.print("Daha küçük sayı girin: ");
                adim += 1;
            } else if (oyuncu < bilgisayar) {
                System.out.print("Daha büyük sayı girin: ");
                adim += 1;
            } else if (oyuncu == bilgisayar) {
                adim += 1;
                System.out.println(adim + " ADIMDA BULDUNUZ");
                break;
            }
        }
    }
}
