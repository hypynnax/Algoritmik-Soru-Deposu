package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] sayiDizisi = {76, 48, 82, 31, 27, 45, 58, 69, 71, 84, 42, 37};
        for (int i = 0; i < sayiDizisi.length; i++) {
            int temp = sayiDizisi[i];
            int enKucukEleman = sayiDizisi[i];
            int enKucukElemanIndeksi = i;
            for (int j = i + 1; j < sayiDizisi.length; j++) {
                if (sayiDizisi[j] < enKucukEleman) {
                    enKucukEleman = sayiDizisi[j];
                    enKucukElemanIndeksi = j;
                }
            }
            sayiDizisi[i] = enKucukEleman;
            sayiDizisi[enKucukElemanIndeksi] = temp;
        }
        for (int sayi : sayiDizisi) {
            System.out.print(sayi + " ");
        }
    }
}
