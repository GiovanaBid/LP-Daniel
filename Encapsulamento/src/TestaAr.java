public class TestaAr {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO TESTES DO AR CONDICIONADO ---\n");

        // Instancie um objeto com marca, modelo e temp inicial 22
        ArCondicionado meuAr = new ArCondicionado("LG", "Dual Inverter", 22);

        // Tente alterar a temp para 10 (deve dar erro) e depois para 25
        System.out.println("Tentando mudar a temperatura direto no 'botão de configuração' (Setter):");
        meuAr.setTemperatura(10); // Vai barrar
        meuAr.setTemperatura(25); // Vai aceitar

        //  Imprima os dados do objeto
        System.out.println("\nEstado atual do aparelho:");
        System.out.println(meuAr.toString());

        // Tente usar o modo turbo com o aparelho ainda desligado
        System.out.println("\nTentando ativar modo turbo...");
        meuAr.modoTurbo(); // Vai avisar que precisa ligar

        // Ligue o aparelho, use o modo turbo e imprima o estado final
        System.out.println("\nLigando o aparelho...");
        meuAr.ligar();

        System.out.println("\nAtivando modo turbo agora que está ligado...");
        meuAr.modoTurbo(); // Agora vai funcionar e cair pra 16 graus

        System.out.println("\nEstado final do aparelho:");
        System.out.println(meuAr.toString()); // Vai mostrar ligado e com 16°C
    }
}