package notificacoes;

public class SMS extends CanalNotificacao {
    private int numeroTelefone;

    public SMS(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número " + this.numeroTelefone + ": " + this.mensagem);
    }
}