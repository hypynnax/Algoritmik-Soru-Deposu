package kilitlidolapbulmacasi;

import java.util.HashMap;

public class KilitliDolapBulmacasi {

    public static void main(String[] args) {
        HashMap dolaplar = dolaplariKapat();
        ogrenciSirasi(dolaplar);
        acik_dolaplar(dolaplar);
    }

    public static HashMap dolaplariKapat() {
        HashMap dolaplar = new HashMap<>();
        for (int i = 1; i < 101; i++) {
            dolaplar.put(i, "kapalı");
        }
        return dolaplar;
    }

    public static void ogrenciSirasi(HashMap dolaplar) {
        for (int i = 1; i < 101; i++) {
            dolaplariAcKapat(i, dolaplar);
        }
    }

    public static void dolaplariAcKapat(int basamak, HashMap dolaplar) {
        for (int i = basamak; i < 101; i += basamak) {
            if (dolaplar.get(i) == "kapalı") {
                dolaplar.replace(i, "açık");
            } else {
                dolaplar.replace(i, "kapalı");
            }
        }
    }

    public static void acik_dolaplar(HashMap dolaplar) {
        for (int i = 1; i < 101; i++) {
            if (dolaplar.get(i) == "açık") {
                System.out.print(i + " ");
            }
        }
    }
}
