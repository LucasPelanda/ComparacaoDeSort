package ComparacaoDeSort;

public class Main {

    static long comparacoes = 0;
    static long trocas = 0;

    static void trocar(int[] v, int i, int j) {
        if (i == j) return;
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
        trocas++;
    }

    static void zera() {
        comparacoes = 0;
        trocas = 0;
    }

    static void executar(String nome, int[] original, int tipo) {
        int[] vetor = new int[original.length];
        for (int i = 0; i < original.length; i++) vetor[i] = original[i];

        zera();

        switch (tipo) {
            case 1 -> BubbleFlag.ordenar(vetor);
            case 2 -> Selection.ordenar(vetor);
            case 3 -> Cocktail.ordenar(vetor);
            case 4 -> CombSort.ordenar(vetor);
            case 5 -> GnomeSort.ordenar(vetor);
            case 6 -> BucketSort.ordenar(vetor);
        }

        System.out.print(nome + " , comparacoes:" + comparacoes + " trocas:" + trocas + "\n");
    }

    static void rodar(String titulo, int[] vetor) {
        System.out.println("\n" + titulo );
        executar("BubbleFlag", vetor, 1);
        executar("Selection", vetor, 2);
        executar("Cocktail", vetor, 3);
        executar("Comb", vetor, 4);
        executar("Gnome", vetor, 5);
        executar("Bucket", vetor, 6);
    }

    public static void main(String[] args) {
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        rodar("aleatório", vetor1);
        rodar("ordenado", vetor2);
        rodar("decrescente", vetor3);
    }
}