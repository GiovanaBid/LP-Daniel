public class Medico {
    private int id;
    private String nome;
    private String especialidade;

    // Construtor para criar o médico
    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Método para o médico "se apresentar" no console
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Médico: " + nome + " (" + especialidade + ")";
    }
}