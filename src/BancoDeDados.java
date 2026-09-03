import java.util.ArrayList;
import java.util.Scanner;

public class BancoDeDados {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public BancoDeDados() {
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("Vidas Secas", "Graciliano Ramos", 1938));

        usuarios.add(new Aluno(
                "Leticia", "00000000000", "leticia@email.com",
                "Informatica", "1A"
        ));

        usuarios.add(new Funcionario(
                "Carlos", "11111111111", "carlos@email.com",
                "Bibliotecario"
        ));
    }

    public void cadastrarLivro(Scanner sc) {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        try {
            System.out.print("Ano: ");
            int ano = sc.nextInt();
            sc.nextLine();

            livros.add(new Livro(titulo, autor, ano));
            System.out.println("Livro cadastrado!");

        } catch (Exception e) {
            System.out.println("Digite um numero!");
            sc.nextLine();
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());

            if (livro.isDisponivel()) {
                System.out.println("Disponivel");
            } else {
                System.out.println("Indisponivel");
            }

            System.out.println();
        }
    }

    public void cadastrarUsuario(Scanner sc) {
        System.out.println("1 - Aluno");
        System.out.println("2 - Funcionario");
        System.out.print("Escolha: ");

        try {
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            if (tipo == 1) {
                System.out.print("Curso: ");
                String curso = sc.nextLine();

                System.out.print("Turma: ");
                String turma = sc.nextLine();

                usuarios.add(new Aluno(nome, cpf, email, curso, turma));
                System.out.println("Aluno cadastrado!");

            } else if (tipo == 2) {
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();

                usuarios.add(new Funcionario(nome, cpf, email, cargo));
                System.out.println("Funcionario cadastrado!");

            } else {
                System.out.println("Opcao invalida!");
            }

        } catch (Exception e) {
            System.out.println("Digite um numero!");
            sc.nextLine();
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.listarInformacoes();
        }
    }

    public void emprestarLivro(Scanner sc) {
        System.out.print("Digite o titulo: ");
        String titulo = sc.nextLine();

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {

                if (livro.isDisponivel()) {
                    livro.emprestar();
                    System.out.println("Livro emprestado!");
                } else {
                    System.out.println("Livro indisponivel!");
                }

                return;
            }
        }

        System.out.println("Livro nao encontrado!");
    }

    public void devolverLivro(Scanner sc) {
        System.out.print("Digite o titulo: ");
        String titulo = sc.nextLine();

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                System.out.println("Livro devolvido!");
                return;
            }
        }

        System.out.println("Livro nao encontrado!");
    }
}
