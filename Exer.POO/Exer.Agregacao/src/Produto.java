public class Produto {
    private int id;
    private String nome;
    private float preco;

    public Produto(int id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public float getPreco() { return preco; }

    @Override
    public String toString() {
        return "Produto [ID: " + this.id + " | Nome: " + this.nome + " | Preço: R$" + this.preco + "]";
    }
}