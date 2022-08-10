package sanslionsayi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SansliOnSayi {

    static final int URETILECEK_EN_YUKSEK_SAYI = 60;
    static final int URETILECEK_SAYI_MIKTARI = 1000000;

    public static void main(String[] args) {
        Map<Integer, Integer> sayilarinTekrarSayisi = new HashMap<>();
        mapeSayilariAta(sayilarinTekrarSayisi);
        List<Integer> sayilarinListeHali = sayilariListeyeAktar(sayilarinTekrarSayisi);
        Collections.shuffle(sayilarinListeHali);
        Set<Integer> treeSet = new TreeSet<>();
        sansliOnSayi(sayilarinListeHali, treeSet);
        sansliOnSayiyiYazdir(treeSet);
    }

    public static int sayiOlustur() {
        int sayi = ((int) (Math.random() * URETILECEK_EN_YUKSEK_SAYI) + 1);
        return sayi;
    }

    public static void mapeSayilariAta(Map<Integer, Integer> map) {
        for (int i = 1; i <= URETILECEK_SAYI_MIKTARI; i++) {
            int sayi = sayiOlustur();
            if (!map.containsKey(sayi)) {
                map.put(sayi, 1);
            } else {
                int value = map.get(sayi);
                map.put(sayi, ++value);
            }
        }
    }

    public static List<Integer> sayilariListeyeAktar(Map<Integer, Integer> sayiMap) {
        List<Integer> liste = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sayiMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 1; i <= value; i++) {
                liste.add(key);
            }
        }
        return liste;
    }

    private static void sansliOnSayi(List<Integer> sayilarinListeHali, Set<Integer> treeSet) {
        while (treeSet.size() < 10) {
            int rastgeleSayi = (int) (Math.random() * URETILECEK_SAYI_MIKTARI);
            treeSet.add(sayilarinListeHali.get(rastgeleSayi));
        }
    }

    public static void sansliOnSayiyiYazdir(Set<Integer> set) {
        int i = 1;
        System.out.println("Günün şanslı on sayısı");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext() && i <= 10) {
            System.out.print(iterator.next());
            if (i != 10) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println("");
    }
}
