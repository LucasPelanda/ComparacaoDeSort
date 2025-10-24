package ComparacaoDeSort;

public class BubbleFlag {
    public static void ordenar(int[] v) {
        int trocou = 1;
        for (int i = 0; i < v.length - 1 && trocou == 1; i++) {
            trocou = 0;
            for (int j = 0; j < v.length - 1 - i; j++) {
                Main.comparacoes++;
                if (v[j] > v[j + 1]) {
                    Main.trocar(v, j, j + 1);
                    trocou = 1;
                }
            }
        }
    }
}
