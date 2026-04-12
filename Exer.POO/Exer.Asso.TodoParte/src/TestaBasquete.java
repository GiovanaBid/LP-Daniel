public class TestaBasquete {
    public static void main(String[] args) {
        // 1. Criamos o objeto Atleta (ele nasce aqui no main)
        Atleta jogador = new Atleta(14, "Lucas Dias", "Ala/Pivô");

        // 2. Criamos o objeto Time
        Time franca = new Time(1, "Sesi Franca", "Helinho");

        // 3. Agregamos o atleta ao time
        franca.contratarAtleta(jogador);

        System.out.println("\n--- ANTES DE ANULAR O TIME ---");
        System.out.println(franca.toString());
        System.out.println(jogador.toString());

        // 4. PROVA DA AGREGAÇÃO: Anulamos o objeto Time
        System.out.println("\n--- ANULANDO O TIME (O time acabou!) ---");
        franca = null;

        // 5. Se tentarmos usar 'franca', daria erro. Mas o 'jogador' continua vivo!
        System.out.println("O time foi para o 'null', mas o jogador ainda existe:");
        System.out.println(jogador.toString());
    }
}