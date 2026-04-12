public class TestaLoja {
    public static void main(String[] args) {
        // 1. Criando os objetos independentes (Eles existem fora do carrinho)
        Produto p1 = new Produto(101, "Mouse Gamer", 150.00f);
        Produto p2 = new Produto(102, "Teclado Mecânico", 300.00f);
        Produto p3 = new Produto(103, "Monitor 144hz", 1200.00f);

        // 2. Criando o carrinho
        Carrinho meuCarrinho = new Carrinho();

        // 3. Agregação: Passando a referência dos produtos para o carrinho
        meuCarrinho.adicionarProduto(p1);
        meuCarrinho.adicionarProduto(p2);
        meuCarrinho.adicionarProduto(p3);

        // Exibindo a parte agregada
        meuCarrinho.exibirCarrinho();

        System.out.println("\n----------------------------------");

        // 4. Composição: Gerando itens que só existem dentro deste carrinho
        // Simulando a compra de 2 Mouses e 1 Monitor
        meuCarrinho.gerarItem(1, 2, p1.getPreco());
        meuCarrinho.gerarItem(2, 1, p3.getPreco());

        // 5. Imprimindo o estado final
        System.out.println(meuCarrinho.toString());
    }
}