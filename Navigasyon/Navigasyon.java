package navigasyon;

public class Navigasyon {

    public static String maps(int[][] harita) {
        String yol = "";
        int satir = harita.length;
        int sutun = harita[0].length;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (harita[i][j] == 1) {
                    yol += i + "" + j + ",";
                }
            }
        }
        return yol;
    }

    public static void main(String[] args) {
        int[][] harita = {{1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}};
        System.out.println(maps(harita));
    }
}
