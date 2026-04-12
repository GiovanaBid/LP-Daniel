public class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private float preco;

    // Construtor completo
    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso [ID: " + id + " | Assento: " + assento +
                " | Tipo: " + tipo + " | Preço: R$" + preco + "]";
    }
}