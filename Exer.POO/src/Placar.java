public class Placar {
    // Atributos
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0; // Inicia em 0
        this.pontosVisitante = 0; // Inicia em 0
        this.periodoQuarto = 1; // Inicia no 1
    }

    // Métodos
    public void registrarPonto(String time, int tipo) {
        if (this.periodoQuarto > 4) {
            System.out.println("O jogo já terminou! Não é possível pontuar.");
            return; // Sai do método
        }

        if (time.equalsIgnoreCase("casa")) {
            this.pontosCasa += tipo; // Soma no atributo correspondente
            System.out.println("Ponto para " + this.nomeTimeCasa + "!");
        } else if (time.equalsIgnoreCase("visitante")) {
            this.pontosVisitante += tipo;
            System.out.println("Ponto para " + this.nomeTimeVisitante + "!");
        } else {
            System.out.println("Time inválido.");
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++; // Incrementa
            System.out.println("Iniciando o " + this.periodoQuarto + "º quarto.");
        } else {
            this.periodoQuarto++; // Vai para 5 para travar o jogo
            System.out.println("O jogo terminou!"); // Avisa se passou do 4
        }
    }

    @Override
    public String toString() {
        String periodo = (this.periodoQuarto <= 4) ? String.valueOf(this.periodoQuarto) : "Fim de Jogo";
        // Exibe placar formatado
        return this.nomeTimeCasa + " " + this.pontosCasa + " x " + this.pontosVisitante + " " + this.nomeTimeVisitante + " - Período: " + periodo;
    }
}