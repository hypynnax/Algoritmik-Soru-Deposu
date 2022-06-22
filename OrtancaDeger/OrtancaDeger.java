package ortancadeger;

import java.util.Scanner;

public class OrtancaDeger {

    public static void ortadeger(String kelime) {
        int uzunluk = kelime.length();
        if (uzunluk % 2 == 0) {
            System.out.println(kelime.substring(uzunluk / 2 - 1, uzunluk / 2 + 1));
        } else {
            System.out.println(kelime.charAt(uzunluk / 2));
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        String kelime = reader.nextLine();
        ortadeger(kelime);
    }
}
