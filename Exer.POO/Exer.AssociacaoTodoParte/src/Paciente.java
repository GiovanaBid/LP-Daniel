public class Paciente {
    private int id;
    private String nome;
    private String cpf;

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + " (CPF: " + cpf + ")";
    }
}