package decimaldenbinaryecevirme;

import java.util.Scanner;

public class DecimaldenBinaryeCevirme {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Dönüşüm yapılacak sayıyı girin : ");
        int decimalSayi = reader.nextInt();
        String binarySayi = "";
        if (decimalSayi == 0) {
            binarySayi = "0";
        }
        while (decimalSayi != 0) {
            binarySayi = decimalSayi % 2 + binarySayi;
            decimalSayi /= 2;
        }
        System.out.println(binarySayi);
    }
}
