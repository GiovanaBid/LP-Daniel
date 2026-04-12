public class TestaSupermercado {
    public static void main(String[] args) {
        // 1. Produtos e Clientes existem antes
        Produto p1 = new Produto(1, "Feijão", 8.50f);
        Produto p2 = new Produto(2, "Arroz", 22.00f);
        Cliente cli = new Cliente(10, "Daniel Arantes");

        // 2. Iniciamos a Venda
        Venda v = new Venda(cli);

        // 3. Composição: Gerando os itens no momento da venda
        v.adicionarItem(1, 2, p1); // 2 Feijões
        v.adicionarItem(2, 1, p2); // 1 Arroz

        v.imprimirResumo();
    }
}
