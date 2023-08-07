import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaLogin {

    private static Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        usuarios.put("usuario1", "senha123");
        usuarios.put("usuario2", "abcd@123");
        // Adicionar mais usuários e senhas conforme necessário

        while (continuar) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (validarCredenciais(usuario, senha)) {
                System.out.println("Login realizado com sucesso!");
                continuar = false;
            } else {
                System.out.println("Credenciais inválidas. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static boolean validarCredenciais(String usuario, String senha) {
        String senhaArmazenada = usuarios.get(usuario);
        return senhaArmazenada != null && senhaArmazenada.equals(senha);
    }
}
