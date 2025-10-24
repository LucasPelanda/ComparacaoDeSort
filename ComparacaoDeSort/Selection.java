package ComparacaoDeSort;

public class Selection {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                Main.comparacoes++;
                if (v[j] < v[posMenor]) posMenor = j;
            }
            Main.trocar(v, i, posMenor);
        }
    }
}
