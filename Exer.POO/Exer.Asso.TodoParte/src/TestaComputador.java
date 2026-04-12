public class TestaComputador {
    public static void main(String[] args) {
        // Note que no main eu NÃO crio um objeto Processador.
        // Eu apenas passo as informações para o Computador.
        Computador meuPC = new Computador(1, "Dell", "Intel", "i7 12th Gen", 4.8f);

        System.out.println(meuPC.toString());

        // Se eu fizer meuPC = null, o processador que foi criado lá dentro
        // morre junto com ele na memória.
    }
}