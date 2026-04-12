public class Conta {
    // Atributos Públicos conforme o exercício
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // Método Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0f; // Saldo inicia zerado
        this.status = true; // Inicia como ativa
    }

    // Métodos de Comportamento
    public void depositar(float valor) {
        if (this.status) { // Só deposita se estiver ativa
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso."); // Confirmação
        } else {
            System.out.println("Erro: Não é possível depositar. Conta inativa.");
        }
    }

    public void sacar(float valor) {
        if (!this.status) {
            System.out.println("Erro: Conta inativa."); // Mensagem de erro
        } else if (this.saldo >= valor) { // Checa se tem saldo
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente."); // Mensagem de erro
        }
    }

    public void encerrarConta() {
        if (this.saldo == 0) { // Só encerra se saldo for 0
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            // Avisa que precisa sacar antes
            System.out.println("Erro: A conta possui saldo de R$ " + this.saldo + ". Saque o valor antes de encerrar.");
        }
    }

    // Método toString formatado
    @Override
    public String toString() {
        return "Conta [Número: " + this.numeroConta + ", Agência: " + this.agencia +
                ", Cliente: '" + this.nomeCliente + "', Saldo: R$ " + this.saldo +
                ", Status: " + (this.status ? "Ativa" : "Encerrada") + "]";
    }
}