package dizidebuyuktenkucugesiralama;

import java.util.Arrays;

public class DizideBuyuktenKucugeSiralama {

    public static void main(String[] args) {
        double[] sayilar = {0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0, 9.1};
        double tut;
        Arrays.sort(sayilar);
        for (int i = 0; i <= (sayilar.length - 1) / 2; i++) {
            tut = sayilar[i];
            sayilar[i] = sayilar[sayilar.length - 1 - i];
            sayilar[sayilar.length - 1 - i] = tut;
        }
        for (double e : sayilar) {
            System.out.print(e + " , ");
        }
    }
}
