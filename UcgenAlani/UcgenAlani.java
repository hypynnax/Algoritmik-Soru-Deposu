package ucgenalani;

import java.util.Scanner;

public class UcgenAlani {

    static double ucgenalani(double taraf1, double taraf2, double taraf3) {
        double sonuc, u;
        u = (taraf1 + taraf2 + taraf3) / 2;
        sonuc = Math.sqrt(u * (u - taraf1) * (u - taraf2) * (u - taraf3));
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Tarafı 1: ");
        int taraf1 = reader.nextInt();
        System.out.print("Tarafı 2: ");
        int taraf2 = reader.nextInt();
        System.out.print("Tarafı 3: ");
        int taraf3 = reader.nextInt();
        System.out.println("Üçgenin alanı : " + ucgenalani(taraf1, taraf2, taraf3));
    }
}
