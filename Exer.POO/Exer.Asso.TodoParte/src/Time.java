import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    // O Time POSSUI uma lista de atletas (Agregação)
    private ArrayList<Atleta> listaAtletas;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        // Inicializamos a lista vazia
        this.listaAtletas = new ArrayList<>();
    }

    // Regra: Método para contratar (agregar) um atleta pronto
    public void contratarAtleta(Atleta a) {
        this.listaAtletas.add(a);
        System.out.println("LOG: " + a.getNome() + " assinou contrato com o " + this.nome);
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Técnico: " + tecnico + " | Jogadores: " + listaAtletas.size();
    }
}