import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> equipe; // A lista que agrega os programadores

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.equipe = new ArrayList<>(); // Inicializa a lista
    }

    // Método para adicionar (agregar)
    public void adicionarProgramador(Programador p) {
        this.equipe.add(p);
    }

    // REGRA: Método para listar todos da equipe
    public void listarEquipe() {
        System.out.println("\n--- Lista de Programadores no Projeto: " + this.nomeProjeto + " ---");

        if (equipe.isEmpty()) {
            System.out.println("Nenhum programador alocado neste projeto.");
        } else {
            // Usamos o "for-each" (para cada programador 'p' na lista 'equipe')
            for (Programador p : equipe) {
                System.out.println(p.toString());
            }
        }
        System.out.println("-----------------------------------------------------------");
    }
}