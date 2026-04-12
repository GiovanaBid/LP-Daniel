public class TestaPlacar {
    public static void main(String[] args) {
        Placar jogo = new Placar("Franca", "Flamengo");
        System.out.println(jogo.toString());

        jogo.registrarPonto("casa", 3); // Cesta de 3 do Franca
        jogo.registrarPonto("visitante", 2); // Cesta de 2 do Flamengo
        System.out.println(jogo.toString());

        jogo.proximoQuarto(); // Vai para o quarto 2
        System.out.println(jogo.toString());
    }
}