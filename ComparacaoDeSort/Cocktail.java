package ComparacaoDeSort;

public class Cocktail {
    public static void ordenar(int[] v) {
        int trocou = 1;
        int inicio = 0;
        int fim = v.length - 1;

        while (trocou == 1) {
            trocou = 0;

            for (int i = inicio; i < fim; i++) {
                Main.comparacoes++;
                if (v[i] > v[i + 1]) {
                    Main.trocar(v, i, i + 1);
                    trocou = 1;
                }
            }

            if (trocou == 0) break;
            trocou = 0;
            fim--;

            for (int i = fim; i > inicio; i--) {
                Main.comparacoes++;
                if (v[i - 1] > v[i]) {
                    Main.trocar(v, i - 1, i);
                    trocou = 1;
                }
            }

            inicio++;
        }
    }
}
