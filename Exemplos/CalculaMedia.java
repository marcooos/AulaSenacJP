import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNotas;
        double somaNotas = 0;

        System.out.print("Digite a quantidade de notas: ");
        quantidadeNotas = scanner.nextInt();

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
