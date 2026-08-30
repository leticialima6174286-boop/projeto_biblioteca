public class Aluno extends Usuario {

    private String curso;
    private String turma;

    public Aluno(String nome, String cpf, String email, String curso, String turma) {
        super(nome, cpf, email);
        this.curso = curso;
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public void listarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
        System.out.println();
    }
}
