package xcizdirme;

import java.util.Scanner;

public class XCizdirme {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Çizilmesini istediğiniz x büyüklüğünü yazın : ");
        int boyut = reader.nextInt();
        String desen = "";
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (i == j || i + j == boyut - 1) {
                    desen += "x";
                } else {
                    desen += " ";
                }
            }
            desen += "\n";
        }
        System.out.println(desen);
    }
}
