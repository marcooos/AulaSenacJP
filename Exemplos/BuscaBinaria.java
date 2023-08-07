public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == chave) {
                return meio;
            } else if (array[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int chave = 23;
        int indice = buscaBinaria(array, chave);
        if (indice != -1) {
            System.out.println("Chave encontrada no índice: " + indice);
        } else {
            System.out.println("Chave não encontrada no array.");
        }
    }
}
