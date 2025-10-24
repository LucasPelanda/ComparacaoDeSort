package ComparacaoDeSort;

public class BucketSort {
    public static void ordenar(int[] v) {
        int n = v.length;
        if (n == 0) return;

        int min = v[0];
        int max = v[0];

        for (int i = 1; i < n; i++) {
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }

        if (min == max) return;

        int qtd = 10;
        int[][] B = new int[qtd][n];
        int[] tam = new int[qtd];

        for (int i = 0; i < n; i++) {
            int idx = ((v[i] - min) * (qtd - 1)) / (max - min);
            B[idx][tam[idx]] = v[i];
            tam[idx]++;
        }

        for (int b = 0; b < qtd; b++) {
            for (int i = 1; i < tam[b]; i++) {
                int chave = B[b][i];
                int j = i - 1;

                while (j >= 0) {
                    Main.comparacoes++;
                    if (B[b][j] > chave) {
                        B[b][j + 1] = B[b][j];
                        Main.trocas++;
                        j--;
                    } else {
                        break;
                    }
                }
                B[b][j + 1] = chave;
            }
        }

        int k = 0;
        for (int b = 0; b < qtd; b++) {
            for (int i = 0; i < tam[b]; i++) {
                v[k] = B[b][i];
                k++;
            }
        }
    }
}
