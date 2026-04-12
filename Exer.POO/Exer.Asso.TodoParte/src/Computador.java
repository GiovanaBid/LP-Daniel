public class Computador {
    private int id;
    private String marcaPC;
    private Processador processador; // O objeto parte

    // O construtor recebe tudo como tipo primitivo/String
    public Computador(int id, String marcaPC, String marcaProc, String modeloProc, float freqProc) {
        this.id = id;
        this.marcaPC = marcaPC;

        // REGRA DA COMPOSIÇÃO: O 'new' acontece aqui dentro!
        this.processador = new Processador(marcaProc, modeloProc, freqProc);
    }

    @Override
    public String toString() {
        return "Computador ID: " + id + " | Marca: " + marcaPC +
                "\nComponente Interno: " + processador.toString();
    }
}