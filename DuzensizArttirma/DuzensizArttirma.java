package duzensizarttirma;

public class DuzensizArttirma {

    public static void main(String[] args) {
        int sonuc = 0, artis = 0;
        boolean yon = false;
        for (int i = 1; i <= 35; i += artis) {
            sonuc += i;
            if (i != 35) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sonuc + "\n");
            }
            if (yon) {
                if (artis > 2) {
                    artis--;
                } else {
                    yon = false;
                    artis--;
                }
            } else {
                if (artis < 4) {
                    artis++;
                } else {
                    yon = true;
                    artis++;
                }
            }
        }
    }
}
