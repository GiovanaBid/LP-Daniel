public class Atleta {
    private int id;
    private String nome;
    private String posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Atleta #" + id + ": " + nome + " (Posição: " + posicao + ")";
    }
}