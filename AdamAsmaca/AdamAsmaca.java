package adamasmaca;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class AdamAsmaca {

    private static Scanner reader = new Scanner(System.in);
    private static int can = 6, daragaci = 0;
    private static String secilenKelime = "", ipucu = "", gorunenKelime = "", girilenHarfler = "";
    private static boolean harfVarMi = false, tahmin = false;

    private static String[][] kelimeleriHazirla() {
        String[][] kelimeler = {{"TÜRKİYE", "ÜLKE"}, {"İRAN", "ÜLKE"},
        {"ÜRDÜN", "ÜLKE"}, {"JAMAİKA", "ÜLKE"}, {"LİBERYA", "ÜLKE"},
        {"AFGANİSTAN", "ÜLKE"}, {"ÇİN", "ÜLKE"}, {"YEMEN", "ÜLKE"},
        {"SUDAN", "ÜLKE"}, {"ANDORRA", "ÜLKE"}, {"MOLDOVA", "ÜLKE"},
        {"VATİKAN", "ÜLKE"}, {"FAS", "ÜLKE"}, {"BOTSVANA", "ÜLKE"},
        {"GÜRCİSTAN", "ÜLKE"}, {"İSVİÇRE", "ÜLKE"}, {"BURUNDİ", "ÜLKE"},
        {"MONAKO", "ÜLKE"}, {"AVUSTURYA", "ÜLKE"}, {"MOĞOLİSTAN", "ÜLKE"},
        {"PATLICAN", "BİTKİ"}, {"KIZILCIK", "BİTKİ"}, {"KORUNGA", "BİTKİ"},
        {"KETEN", "BİTKİ"}, {"KEKİK", "BİTKİ"}, {"DEREOTU", "BİTKİ"},
        {"KİRAZ", "BİTKİ"}, {"MARUL", "BİTKİ"}, {"HARDAL", "BİTKİ"},
        {"DİŞBUDAK", "BİTKİ"}, {"BİBERİYE", "BİTKİ"}, {"KARANFİL", "BİTKİ"},
        {"MANOLYA", "BİTKİ"}, {"KARNIBAHAR", "BİTKİ"}, {"NOHUT", "BİTKİ"},
        {"SÜMBÜL", "BİTKİ"}, {"FULYA", "BİTKİ"}, {"BERGAMOT", "BİTKİ"},
        {"KABAK", "BİTKİ"}, {"HANIMELİ", "BİTKİ"}, {"İSTANBUL", "ŞEHİR"},
        {"KOCAELİ", "ŞEHİR"}, {"ANKARA", "ŞEHİR"}, {"ORDU", "ŞEHİR"},
        {"BİTLİS", "ŞEHİR"}, {"AYDIN", "ŞEHİR"}, {"YOZGAT", "ŞEHİR"},
        {"BURSA", "ŞEHİR"}, {"OSMANİYE", "ŞEHİR"}, {"ÇANKIRI", "ŞEHİR"},
        {"KONYA", "ŞEHİR"}, {"VAN", "ŞEHİR"}, {"AFYON", "ŞEHİR"},
        {"MUŞ", "ŞEHİR"}, {"ANTALYA", "ŞEHİR"}, {"BARTIN", "ŞEHİR"},
        {"SİİRT", "ŞEHİR"}, {"KARAMAN", "ŞEHİR"}, {"MANİSA", "ŞEHİR"},
        {"KÜTAHYA", "ŞEHİR"}, {"DÜZCE", "ŞEHİR"}, {"KÖPEK", "HAYVAN"},
        {"TAPİR", "HAYVAN"}, {"LAGOS", "HAYVAN"}, {"EBABİL", "HAYVAN"},
        {"BİZON", "HAYVAN"}, {"TIRTIL", "HAYVAN"}, {"BOĞA", "HAYVAN"},
        {"SİVRİSİNEK", "HAYVAN"}, {"YENGEÇ", "HAYVAN"}, {"TAVUK", "HAYVAN"},
        {"ORNİTORENK", "HAYVAN"}, {"MERCAN", "HAYVAN"}, {"KANGURU", "HAYVAN"},
        {"KEÇİ", "HAYVAN"}, {"ZÜRAFA", "HAYVAN"}, {"AYI", "HAYVAN"},
        {"KAPLAN", "HAYVAN"}, {"LÜFER", "HAYVAN"}, {"VAŞAK", "HAYVAN"},
        {"ÖRDEK", "HAYVAN"}, {"ASLAN", "HAYVAN"}, {"KEDİ", "HAYVAN"}};
        return kelimeler;
    }

    private static String darAgaci(int index) {
        String[] darAgaci = {"              +---------+\n              |         |\n                        |\n                        |\n                        |\n                        |\n                        |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n                        |\n                        |\n                        |\n                        |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n              |         |\n              |         |\n                        |\n                        |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n              |\\        |\n              | \\       |\n                        |\n                        |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n             /|\\        |\n            / | \\       |\n                        |\n                        |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n             /|\\        |\n            / | \\       |\n               \\        |\n                \\       |\n                        |\n                 =======|=======",
            "              +---------+\n              |         |\n              O         |\n             /|\\        |\n            / | \\       |\n             / \\        |\n            /   \\       |\n                        |\n                 =======|======",};
        return darAgaci[index];
    }

    private static String tekrarliYazdirma(String karater, int tekrar) {
        String cikti = "";
        for (int i = 1; i <= tekrar; i++) {
            cikti += karater;
        }
        return cikti;
    }

    static String harfAl() {
        boolean devam = true;
        tahmin = false;
        String harf = " ";
        while (devam) {
            System.out.print("Bir harf ve ya bir tahmin girin : ");
            harf = reader.nextLine();
            if (harf.toUpperCase() == secilenKelime) {
                tahmin = true;
                devam = false;
            } else {
                char karakter = harf.charAt(0);
                if ((harf.length() == 1) && (Character.isLetter(karakter) == true) && (!gorunenKelime.contains(harf)) && (!girilenHarfler.contains(harf))) {
                    girilenHarfler += harf;
                    devam = false;
                } else {
                    System.out.print("Önceden girmediğiniz ");
                }
            }
        }
        return harf.toUpperCase();
    }

    private static ArrayList harfinKonumu(String alinanHarf) {
        ArrayList harfinYerleri = new ArrayList();
        harfVarMi = false;
        for (int i = 0; i < secilenKelime.length(); i++) {
            if (secilenKelime.charAt(i) == alinanHarf.charAt(0)) {
                harfinYerleri.add(i);
                harfVarMi = true;
            }
        }
        return harfinYerleri;
    }

    private static void oyunaBasla() {
        String[][] kelimeler = kelimeleriHazirla();
        Random random = new Random();
        int cekilenSira = random.nextInt(kelimeler.length);
        secilenKelime = kelimeler[cekilenSira][0];
        ipucu = kelimeler[cekilenSira][1];
        gorunenKelime = tekrarliYazdirma("-", secilenKelime.length());
        System.out.println("|" + tekrarliYazdirma("-", 41) + "|");
        System.out.println("Can : " + tekrarliYazdirma("❤", can) + tekrarliYazdirma(" ", 13) + "İpucu : " + ipucu);
        System.out.println(darAgaci(daragaci));
        System.out.println("Kelime : " + gorunenKelime);
    }

    private static void oyunaDevam() {
        while ((can > 0) && (secilenKelime != gorunenKelime)) {
            String alinanHarf = harfAl();
            ArrayList harfinYerleri = harfinKonumu(alinanHarf);
            if (tahmin == true) {
                System.exit(1);
            }
            if (harfVarMi == true) {
                for (int i = 0; i < harfinYerleri.size(); i++) {
                    int index = (int) harfinYerleri.get(i);
                    gorunenKelime = gorunenKelime.substring(0, index) + alinanHarf + gorunenKelime.substring(index + 1);
                }
            } else {
                can -= 1;
                daragaci += 1;
            }
            if (can < 1) {
                System.out.println("|" + tekrarliYazdirma("-", 41) + "|");
                System.out.println(darAgaci(daragaci));
            } else {
                System.out.println("|" + tekrarliYazdirma("-", 41) + "|");
                System.out.println("Can : " + tekrarliYazdirma("❤", can) + tekrarliYazdirma(" ", 13) + "İpucu : " + ipucu);
                System.out.println(darAgaci(daragaci));
                System.out.println("Kelime : " + gorunenKelime);
            }
        }
    }

    private static void oyunSonucu(String secilenKelime, int can) {
        if (can > 0) {
            System.out.println("TEBRİKLER!!!\nKazandınız");
        } else {
            System.out.println("MAALESEF:(((\nKaybettiniz");
            System.out.println("Kelime " + secilenKelime + " olacaktı");
        }
    }

    public static void main(String[] args) {
        boolean devam = true;
        while (devam) {
            System.out.println(tekrarliYazdirma("~", 15) + " Adam Asmaca " + tekrarliYazdirma("~", 15));
            oyunaBasla();
            oyunaDevam();
            oyunSonucu(secilenKelime, can);
            System.out.println("Oyuna devam etmek istiyor musunuz?(E/H)");
            String sorgu = reader.next();
            if ("h".equals(sorgu.toLowerCase())) {
                devam = false;
            }
        }
    }
}
