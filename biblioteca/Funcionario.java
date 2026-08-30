public class Funcionario extends Usuario {

    private String cargo;

    public Funcionario(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void listarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Cargo: " + cargo);
        System.out.println();
    }
}
