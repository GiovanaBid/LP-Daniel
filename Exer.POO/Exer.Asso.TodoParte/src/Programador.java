public class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Método para facilitar a listagem depois
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Linguagem: " + linguagemPrincipal;
    }
}