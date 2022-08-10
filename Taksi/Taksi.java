package taksi;

import java.util.Scanner;

class Taksimetre {

    static double siyahİndiBindi = 16.66, siyahKmÜcreti = 10.71, turkuazİndiBindi = 11.27, turkuazKmÜcreti = 7.25, sarıBordoİndiBindi = 9.80, sarıBordoKmÜcreti = 6.30;

    static void siyahTaksi(int km) {
        System.out.println(siyahİndiBindi + (km * siyahKmÜcreti));
    }

    static void turkuazTaksi(int km) {
        System.out.println(turkuazİndiBindi + (km * turkuazKmÜcreti));
    }

    static void sarıBordoTaksi(int km) {
        System.out.println(sarıBordoİndiBindi + (km * sarıBordoKmÜcreti));
    }
}

public class Taksi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir taksi rengi giriniz: ");
        String taksiRengi = reader.nextLine();
        System.out.print("Kaç km gittiğiniz giriniz: ");
        int alinanYol = reader.nextInt();
        if (taksiRengi.equalsIgnoreCase("siyah")) {
            Taksimetre.siyahTaksi(alinanYol);
        } else if (taksiRengi.equalsIgnoreCase("turkuaz")) {
            Taksimetre.turkuazTaksi(alinanYol);
        } else if (taksiRengi.equalsIgnoreCase("bordo")) {
            Taksimetre.sarıBordoTaksi(alinanYol);
        } else if (taksiRengi.equalsIgnoreCase("sarı")) {
            Taksimetre.sarıBordoTaksi(alinanYol);
        } else {
            System.out.println("Lütfen geçerli bir taksi rengi giriniz");
        }
    }
}
