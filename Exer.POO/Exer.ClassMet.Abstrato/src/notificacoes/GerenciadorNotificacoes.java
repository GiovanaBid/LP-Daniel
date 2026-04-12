package notificacoes;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    // Método estático seguindo o estilo do seu professor
    public static void processarEnvio(CanalNotificacao canal) {
        canal.exibirDados(); // Chama o método do pai
        canal.enviar();      // Polimorfismo: chama o enviar() específico da filha
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        // 1. Criar o ArrayList do tipo PAI (CanalNotificacao)
        ArrayList<CanalNotificacao> listaEnvio = new ArrayList<>();

        // 2. Adicionar objetos das classes filhas
        listaEnvio.add(new Email("joao@email.com", "Sua fatura chegou!", "Boleto Mensal"));
        listaEnvio.add(new SMS("Maria", "Seu código de verificação é 4455", 99887766));
        listaEnvio.add(new WhatsApp("Grupo da Família", "Bom dia a todos!"));

        System.out.println("=== INICIANDO DISPARO DE MENSAGENS ===\n");

        // 3. Ponto alto: Percorrer a lista com foreach
        for (CanalNotificacao c : listaEnvio) {
            processarEnvio(c);
        }
    }
}