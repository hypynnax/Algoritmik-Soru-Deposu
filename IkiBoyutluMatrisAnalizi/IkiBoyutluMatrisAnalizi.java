package ikiboyutlumatrisanalizi;

public class IkiBoyutluMatrisAnalizi {

    public static void main(String[] args) {
        int[][] matris = new int[10][10];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                int rastgele = (int) (Math.random() * 10);
                matris[i][j] = rastgele;
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("");
        }
        int sagdanCaprazToplam = 0, soldanCaprazToplam = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                if (i == j) {
                    soldanCaprazToplam += matris[i][j];
                }
                if (i + j == matris.length - 1) {
                    sagdanCaprazToplam += matris[i][j];
                }
            }
        }
        System.out.println("Soldan çarpaz toplam : " + soldanCaprazToplam + "\nSağdan çapraz toplam : " + sagdanCaprazToplam);
    }
}
