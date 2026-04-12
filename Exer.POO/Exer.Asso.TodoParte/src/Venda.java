import java.util.ArrayList;

public class Venda {
    private Cliente cliente; // Agregação
    private ArrayList<ItemVenda> itens; // Composição

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // REGRA DE COMPOSIÇÃO: O ItemVenda é instanciado AQUI DENTRO
    public void adicionarItem(int idItem, int qtd, Produto p) {
        ItemVenda novoItem = new ItemVenda(idItem, qtd, p);
        this.itens.add(novoItem);
    }

    public float calcularTotalVenda() {
        float total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("--- Itens da Compra ---");
        for (ItemVenda item : itens) {
            System.out.println(item.toString());
        }
        System.out.println("TOTAL: R$" + calcularTotalVenda());
    }
}