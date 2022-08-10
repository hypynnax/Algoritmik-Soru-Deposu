package xgunsonrahaftaninhangigunu;

import java.util.Scanner;

public class XGunSonraHaftaninHangiGunu {

    public static void main(String[] args) {
        String[] gunler = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
        Scanner reader = new Scanner(System.in);
        System.out.print("Bu günün ne olduğunu girin: ");
        String bugun = reader.nextLine();
        System.out.print("Kaç gün sonrasını istediğinizi girin: ");
        int kacGun = reader.nextInt();
        int temp = 0;
        for (int i = 0; i < gunler.length; i++) {
            if (bugun.equalsIgnoreCase(gunler[i])) {
                temp = i;
            }
        }
        temp = (temp + kacGun) % 7;
        System.out.println(bugun + " gününden " + kacGun + " gün sonraki gün :  " + gunler[temp]);
    }
}
