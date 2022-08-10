package iskambildestesi;

public class IskambilDestesi {

    public static void main(String[] args) {
        String[] simge = {"MAÇA", "KUPA", "KARO", "SİNEK"};
        String[] sayi = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] deste = new int[52];
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
        for (int i = 0; i < deste.length; i++) {
            int temp = deste[i];
            int rastgele = (int) (Math.random() * 52);
            deste[i] = deste[rastgele];
            deste[rastgele] = temp;
        }
        for (int i = 0; i < deste.length; i++) {
            int siraSimge = deste[i] / 13;
            int siraSayi = deste[i] % 13;
            System.out.println(simge[siraSimge] + " " + sayi[siraSayi]);
        }
    }
}
