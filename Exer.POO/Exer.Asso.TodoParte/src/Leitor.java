public class Leitor {
    private int id;
    private String nome;

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Leitor: " + nome + " (ID: " + id + ")";
    }
}