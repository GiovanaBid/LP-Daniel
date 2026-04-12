public class TestaConta {
    public static void main(String[] args) {
        // 1. Instanciando o João
        Conta c1 = new Conta(1001, 12, "João Silva");

        // 2 e 3. Depósito e Saque de c1
        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.toString());

        // 4. Instanciando a Maria
        Conta c2 = new Conta(1002, 12, "Maria Souza");

        // 5. Saque sem saldo da Maria
        c2.sacar(50);

        // 6. Tentando encerrar c1 com saldo
        c1.encerrarConta();

        // 7. Esvaziando c1 e encerrando
        c1.sacar(300); // Tira o restante
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}