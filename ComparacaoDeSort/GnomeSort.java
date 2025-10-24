package ComparacaoDeSort;

public class GnomeSort {
    public static void ordenar(int[] v) {
        int i = 1;
        int n = v.length;

        while (i < n) {
            Main.comparacoes++;
            if (v[i] >= v[i - 1]) {
                i++;
            } else {
                Main.trocar(v, i, i - 1);
                i--;
                if (i == 0) i = 1;
            }
        }
    }
}
