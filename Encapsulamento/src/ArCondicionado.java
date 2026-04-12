public class ArCondicionado {
    //Atributos Privados (Encapsulamento: ninguém mexe de fora)
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // Construtor sem parâmetros (Valores padrão)
    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    // Construtor com parâmetros
    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        // Chama o setter para garantir que a temperatura inicial seja válida (entre 16 e 30)
        this.setTemperatura(temperatura);
        this.ligado = false;
    }

    //  Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    // A Regra: só aceita entre 16 e 30
    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: Temperatura " + temperatura + "°C inválida. Permitido apenas de 16°C a 30°C.");
        }
    }

    //  Métodos Públicos (Os "botões" que o usuário pode apertar)
    public void ligar() {
        if (!this.ligado) { // Verifica se NÃO está ligado
            this.ligado = true;
            System.out.println("Aparelho ligado.");
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado) { // Verifica se está ligado
            this.ligado = false;
            System.out.println("Aparelho desligado.");
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    public void ajustarTemperatura(int novaTemp) {
        if (this.ligado) {
            // Se estiver ligado, usa o porteiro (setter) para tentar mudar a temperatura
            this.setTemperatura(novaTemp);
        } else {
            System.out.println("Aviso: Ligue o aparelho antes de ajustar a temperatura.");
        }
    }

    public void modoTurbo() {
        if (this.ligado) {
            // Chama o método escondido que faz o resfriamento
            this.processarResfriamentoRapido();
        } else {
            System.out.println("Aviso: Não é possível ativar o Modo Turbo com o aparelho desligado.");
        }
    }

    // Método Privado (A lógica interna que o usuário não vê)
    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        // Usa o setter para cravar no mínimo permitido
        this.setTemperatura(16);
        System.out.println("Modo Turbo ativado! Temperatura definida para 16°C.");
    }

    // Método toString (Para imprimir os dados do objeto facilmente)
    @Override
    public String toString() {
        // Operador ternário (this.ligado ? "Sim" : "Não") para ficar mais bonito na tela
        return "ArCondicionado [" +
                "Marca: '" + marca + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Temperatura: " + temperatura + "°C" +
                ", Ligado: " + (ligado ? "Sim" : "Não") +
                ']';
    }
}