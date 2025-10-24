package ComparacaoDeSort;

public class CombSort {
    public static void ordenar(int[] v) {
        int n = v.length;
        int gap = n;
        int trocou = 1;

        while (gap > 1 || trocou == 1) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            trocou = 0;

            for (int i = 0; i + gap < n; i++) {
                Main.comparacoes++;
                if (v[i] > v[i + gap]) {
                    Main.trocar(v, i, i + gap);
                    trocou = 1;
                }
            }
        }
    }
}
