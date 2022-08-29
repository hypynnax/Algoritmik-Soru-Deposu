package aslayenilmeyentahminoyunu;

import java.util.Scanner;

public class AslaYenilmeyenTahminOyunu {

    static int oyunaBasla() {
        Scanner reader = new Scanner(System.in);
        int tutulan_sayi = -1;
        System.out.println("Hadi başlayalım aklından 0 ile 12 arası bir sayı tut(0 ve 12 dahil)\nUnutma ben asla kaybetmem");
        System.out.print("Tuttuğun sayı 6'dan büyük mü? : ");
        String sorgu = reader.nextLine();
        if (sorgu.toLowerCase().equals("evet")) {
            System.out.print("Tuttuğun sayı çift mi? : ");
            sorgu = reader.nextLine();
            if (sorgu.toLowerCase().equals("evet")) {
                System.out.print("Tuttuğun sayı 5'in katı mi? : ");
                sorgu = reader.nextLine();
                if (sorgu.toLowerCase().equals("evet")) {
                    tutulan_sayi = 10;
                } else {
                    System.out.print("Tuttuğun sayı 6'nın katı mi? : ");
                    sorgu = reader.nextLine();
                    if (sorgu.toLowerCase().equals("evet")) {
                        tutulan_sayi = 12;
                    } else {
                        tutulan_sayi = 8;
                    }
                }
            } else {
                System.out.print("Tuttuğun sayı 3'ün katı mı? : ");
                sorgu = reader.nextLine();
                if (sorgu.toLowerCase().equals("evet")) {
                    tutulan_sayi = 9;
                } else {
                    System.out.print("Tuttuğun sayı iki basamaklı mı? : ");
                    sorgu = reader.nextLine();
                    if (sorgu.toLowerCase().equals("evet")) {
                        tutulan_sayi = 11;
                    } else {
                        tutulan_sayi = 7;
                    }
                }
            }
        } else {
            System.out.print("Tuttuğun sayı asal mı? : ");
            sorgu = reader.nextLine();
            if (sorgu.toLowerCase().equals("evet")) {
                System.out.print("Tuttuğun sayı çift mi? : ");
                sorgu = reader.nextLine();
                if (sorgu.toLowerCase().equals("evet")) {
                    tutulan_sayi = 2;
                } else {
                    System.out.print("Tuttuğun sayı 4'ten büyük mü? ? : ");
                    sorgu = reader.nextLine();
                    if (sorgu.toLowerCase().equals("evet")) {
                        tutulan_sayi = 5;
                    } else {
                        tutulan_sayi = 3;
                    }
                }
            } else {
                System.out.print("Tuttuğun sayı çift mi? : ");
                sorgu = reader.nextLine();
                if (sorgu.toLowerCase().equals("evet")) {
                    System.out.print("Tuttuğun sayı 3'ün katı mi? : ");
                    sorgu = reader.nextLine();
                    if (sorgu.toLowerCase().equals("evet")) {
                        tutulan_sayi = 6;
                    } else {
                        System.out.print("Tutuğun sayı 2'nin katı mı? : ");
                        sorgu = reader.nextLine();
                        if (sorgu.toLowerCase().equals("evet")) {
                            tutulan_sayi = 4;
                        } else {
                            tutulan_sayi = 0;
                        }
                    }
                } else {
                    tutulan_sayi = 1;
                }
            }
        }
        return tutulan_sayi;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Oyunu oynamaya hazır mısın? Unutma sadece 'Evet' veya 'Hayır' diyebilirsin!\nCevabın : ");
        String oyunBaslasinMi = reader.nextLine();
        if (oyunBaslasinMi.toLowerCase().equals("evet")) {
            int tutulanSayi = oyunaBasla();
            System.out.println("Tuttuğun sayı " + tutulanSayi + "\nDoğru mu? : ");
            String sorgu = reader.nextLine();
            if (sorgu.toLowerCase().equals("hayir")) {
                System.out.println("Yalan söylediğin için ben kazandım!");
            } else {
                System.out.println("Sana söylemiştim ben kaçınılmazım");
            }
        } else if (oyunBaslasinMi.toLowerCase().equals("hayir")) {
            System.out.println("Korkacağını biliyordum :))\nBeni zaten yenemezdin!");
        } else {
            System.out.println("Hadi ama türkçeyide mi bilmiyorsun?");
        }
    }
}
