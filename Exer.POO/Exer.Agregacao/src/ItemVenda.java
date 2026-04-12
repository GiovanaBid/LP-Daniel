public class ItemVenda {
    private int id;
    private int quantidade;
    private float valorUnitario;

    public ItemVenda(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "ItemVenda [ID: " + this.id + " | Qtd: " + this.quantidade +
                " | Valor Unitário: R$" + this.valorUnitario + " | Subtotal: R$" + (this.quantidade * this.valorUnitario) + "]";
    }
}