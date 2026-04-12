import java.util.ArrayList;

public class Carrinho {
    // Listas para guardar os objetos
    private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> itens;

    public Carrinho() {
        // Inicializa as listas para não dar erro de "NullPointer"
        this.produtos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    // --- AGREGAÇÃO ---
    // Recebe o objeto Produto já pronto e só guarda na lista
    public void adicionarProduto(Produto p) {
        this.produtos.add(p);
        System.out.println("Agregação: Produto '" + p.getNome() + "' referenciado no carrinho.");
    }

    public void exibirCarrinho() {
        System.out.println("\n--- Super Loja do Daniel ---");
        System.out.println("Catálogo de Produtos no Carrinho:");
        for (Produto p : this.produtos) {
            System.out.println(p.toString());
        }
    }

    // --- COMPOSIÇÃO ---
    // Recebe apenas DADOS, cria o objeto ItemVenda AQUI DENTRO e guarda na lista
    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda novoItem = new ItemVenda(id, qtd, valor);
        this.itens.add(novoItem);
        System.out.println("Composição: Item de Venda (ID " + id + ") criado e anexado ao carrinho.");
    }

    public void removerItem(int id) {
        // Percorre a lista para achar o ID e remover
        for (int i = 0; i < this.itens.size(); i++) {
            if (this.itens.get(i).getId() == id) {
                this.itens.remove(i);
                System.out.println("Item " + id + " removido com sucesso.");
                return; // Sai do método após remover
            }
        }
        System.out.println("Erro: Item " + id + " não encontrado.");
    }

    @Override
    public String toString() {
        String texto = "\n========== ESTADO DO CARRINHO ==========\n";
        texto += "Qtd de Produtos Agregados: " + this.produtos.size() + "\n";
        texto += "Qtd de Itens Compostos: " + this.itens.size() + "\n";
        texto += "Lista de Itens da Venda:\n";

        for (ItemVenda item : this.itens) {
            texto += item.toString() + "\n";
        }
        texto += "========================================";
        return texto;
    }
}