package vucutkitleındeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double VKI;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = reader.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo = reader.nextDouble();
        VKI = kilo / Math.pow(boy, 2);
        System.out.println("Vücut kitle indeksiniz:" + VKI);
        if (VKI < 18.5) {
            System.out.println("Zayıf");
        } else if (VKI >= 18.5 && VKI < 25) {
            System.out.println("Normal Kilolu");
        } else if (VKI >= 25 && VKI < 30) {
            System.out.println("Fazla Kilolu");
        } else if (VKI >= 30 && VKI < 35) {
            System.out.println("Tip 1 Obez");
        } else if (VKI >= 35 && VKI < 40) {
            System.out.println("Tip 2 Obez");
        } else if (VKI >= 40 && VKI < 50) {
            System.out.println("Morbid obez(İleri derecede obez)");
        } else if (VKI >= 50 && VKI < 60) {
            System.out.println("Süper Obez");
        } else if (VKI >= 60 && VKI < 100) {
            System.out.println("Süper Süper Obez");
        }
        System.out.printf("İdeal Kilonuz: %2.2f \n", 21.7 * Math.pow(boy, 2));
    }
}
