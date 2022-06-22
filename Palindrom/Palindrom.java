package palindrom;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Palindrome olup olmadığını kontrol etmek istediğiniz kelimeyi girin: ");
        String kelime = reader.nextLine();
        boolean kontrol = false;
        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                kontrol = true;
            }
        }
        if (kontrol == false) {
            System.out.println("Bu kelime palindromedur.");
        } else {
            System.out.println("Bu kelime palindrome değildir.");
        }
    }
}
