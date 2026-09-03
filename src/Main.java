import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();

        int opcao = 0;

        do {
            System.out.println("\n===== SISTEMA DA BIBLIOTECA =====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Cadastrar Usuario");
            System.out.println("4 - Listar Usuarios");
            System.out.println("5 - Realizar Emprestimo");
            System.out.println("6 - Devolver Livro");
            System.out.println("7 - Sair");
            System.out.print("Opcao: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:
                        banco.cadastrarLivro(sc);
                        break;

                    case 2:
                        banco.listarLivros();
                        break;

                    case 3:
                        banco.cadastrarUsuario(sc);
                        break;

                    case 4:
                        banco.listarUsuarios();
                        break;

                    case 5:
                        banco.emprestarLivro(sc);
                        break;

                    case 6:
                        banco.devolverLivro(sc);
                        break;

                    case 7:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                }

            } catch (Exception e) {
                System.out.println("Digite apenas numeros!");
                sc.nextLine();
            }

        } while (opcao != 7);

        sc.close();
    }
}
