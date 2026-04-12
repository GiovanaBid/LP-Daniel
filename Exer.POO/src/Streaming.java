public class Streaming {
    // Atributos
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true; // Inicia como true
        this.ultimoFilmeAssistido = ""; // Inicia vazio

        // Define a mensalidade com base no plano escolhido
        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0f;
        }
    }

    // Métodos
    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Aviso: Conta suspensa. Por favor, pague a fatura para assistir.");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false; // Muda o status
        System.out.println("Assinatura cancelada com sucesso.");
    }

    @Override
    public String toString() {
        // Formata Ativo/Suspenso
        return "Streaming [Usuário: '" + this.usuario + "', Plano: '" + this.plano +
                "', Mensalidade: R$ " + this.mensalidade +
                ", Último Filme: '" + this.ultimoFilmeAssistido +
                "', Status: " + (this.ativo ? "Ativo" : "Suspenso") + "]";
    }
}