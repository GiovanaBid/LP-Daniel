package notificacoes;

public class WhatsApp extends CanalNotificacao {
    private String statusLeitura;

    public WhatsApp(String destinatario, String mensagem) {
        super(destinatario, mensagem);
        this.statusLeitura = "Enviada"; // Status inicial
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario + "... Mensagem: " + this.mensagem);
        this.statusLeitura = "Entregue";
    }
}