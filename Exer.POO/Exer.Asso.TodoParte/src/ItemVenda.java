public class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto; // Agregação: o item aponta para um produto do estoque

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public float calcularSubtotal() {
        return this.quantidade * this.produto.getPreco();
    }

    @Override
    public String toString() {
        return produto.getNome() + " | Qtd: " + quantidade + " | Subtotal: R$" + calcularSubtotal();
    }
}