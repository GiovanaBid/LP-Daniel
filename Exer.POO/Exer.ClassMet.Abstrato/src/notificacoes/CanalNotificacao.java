package notificacoes;

public abstract class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    // Método Concreto: comum a todos
    public void exibirDados() {
        System.out.println("Destinatário: " + this.destinatario);
        System.out.println("Mensagem: " + this.mensagem);
    }

    // Método Abstrato: obriga as filhas a implementarem sua própria regra
    public abstract void enviar();
}