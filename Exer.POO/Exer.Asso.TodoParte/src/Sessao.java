import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // Relacionamentos
    private Filme filme; // Agregação (Atributo de classe)
    private ArrayList<Ingresso> ingressos; // Composição (Lista interna)

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>(); // Inicializa a lista de ingressos
    }

    // Regra de Agregação: Recebe o objeto Filme pronto
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Regra de Composição: Recebe dados e instancia o Ingresso aqui dentro
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String info = "======= DETALHES DA SESSÃO =======\n" +
                "ID: " + id + " | Sala: " + sala + "\n" +
                "Horário: " + horario.format(dtf) + "\n";

        // Verifica se há um filme vinculado para não dar erro
        info += (filme != null) ? filme.toString() : "Nenhum filme vinculado";

        info += "\n\n--- Ingressos Vendidos ---\n";
        for (Ingresso i : ingressos) {
            info += i.toString() + "\n";
        }
        info += "==================================";

        return info;
    }
}