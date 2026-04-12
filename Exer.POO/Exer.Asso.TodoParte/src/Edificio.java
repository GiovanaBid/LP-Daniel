import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    // REGRA: Método que recebe dados e CRIA o objeto internamente
    public void construirApartamento(int num, int andar) {
        // Composição pura: o objeto Apartamento nasce aqui dentro
        Apartamento novoApto = new Apartamento(num, andar);
        this.apartamentos.add(novoApto);
        System.out.println("LOG: Unidade " + num + " construída no edifício " + this.nome);
    }

    public void listarApartamentos() {
        System.out.println("\n--- Plantas do Edifício: " + nome + " ---");
        for (Apartamento a : apartamentos) {
            System.out.println(a.toString());
        }
    }
}