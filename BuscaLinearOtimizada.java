public class BuscaLinearOtimizada {
    public static int buscaLinear(int[] array, int chave) {
        int n = array.length;
        int ultimo = array[n - 1]; // Sentinela

        array[n - 1] = chave; // Substitui o último elemento pelo valor da chave

        int i = 0;
        while (array[i] != chave) {
            i++;
        }

        array[n - 1] = ultimo; // Restaura o último elemento

        if (i < n - 1 || array[n - 1] == chave) {
            return i;
        } else {
            return -1; // Elemento não encontrado
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 9, 4, 7, 2, 8};
        int chave = 4;
        int indice = buscaLinear(array, chave);
        if (indice != -1) {
            System.out.println("Chave encontrada no índice: " + indice);
        } else {
            System.out.println("Chave não encontrada no array.");
        }
    }
}
