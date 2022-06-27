package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sayiDizisi = {19, 28, 37, 46, 55, 64, 73, 82, 91};
        int altSinir = 0, ustSinir = sayiDizisi.length - 1;
        int aranan = 5;
        while (altSinir <= ustSinir) {
            int ortaDeger = (altSinir + ustSinir) / 2;
            if (sayiDizisi[ortaDeger] == aranan) {
                System.out.println("eleman bulundu");
                return;
            } else if (sayiDizisi[ortaDeger] > aranan) {
                ustSinir = ortaDeger - 1;
            } else {
                altSinir = ortaDeger + 1;
            }
        }
        System.out.println("eleman mevcut değil");
    }
}
