package sifreuretme;

import java.util.Scanner;

public class SifreUretme {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz şifrenin uzunluğunu girin: ");
        int uzunluk = reader.nextInt();
        String sifre = "";
        for (int i = 0; i < uzunluk; i++) {
            int rastgele = (int) (Math.random() * 94) + 33;
            sifre += (char) rastgele;
        }
        System.out.println("Rastgele şifre oluşturuldu");
        System.out.println(sifre);
    }
}
