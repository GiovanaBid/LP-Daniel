public class Processador {
    private String marca;
    private String modelo;
    private float frequencia; // ex: 3.5f GHz

    public Processador(String marca, String modelo, float frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + frequencia + "GHz)";
    }
}