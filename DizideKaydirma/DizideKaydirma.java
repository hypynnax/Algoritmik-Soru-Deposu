package dizidekaydirma;

import java.util.Scanner;

public class DizideKaydirma {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = reader.nextLine();
        System.out.print("Kaydırmak istedğiniz sayıyı giriniz: ");
        int sayi = reader.nextInt();
        char[] dizi = new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            dizi[i] = kelime.charAt(i);
        }
        char temp;
        for (int i = 0; i < sayi; i++) {
            temp = dizi[kelime.length() - 1];
            for (int j = 0; j < kelime.length() - 1; j++) {
                dizi[kelime.length() - 1 - j] = dizi[kelime.length() - 2 - j];
            }
            dizi[0] = temp;
        }
        for (char e : dizi) {
            System.out.print(e);
        }
    }
}
