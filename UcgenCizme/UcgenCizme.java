package ucgencizme;

import java.util.Scanner;

public class UcgenCizme {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Lütfen üçgenin yüksekliği için bir tamsayı giriniz: ");
        int yukseklik = reader.nextInt();
        String yaz = "";
        int i = 1;
        while (yukseklik > 0) {
            String bosluk = "";
            String yildiz = "";
            int p = i;
            while (p > 0) {
                yildiz = yildiz + "*";
                p = p - 1;
            }
            int q = yukseklik - 1;
            while (q > 0) {
                bosluk = bosluk + " ";
                q = q - 1;
            }
            yaz = yaz + bosluk + yildiz + "\n";
            i = i + 2;
            yukseklik--;
        }
        System.out.println(yaz);
    }
}
