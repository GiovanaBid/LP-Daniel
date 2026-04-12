import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Para deixar a data bonita

public class Consulta {
    private LocalDateTime data;
    private float valorDaConsulta;

    // Aqui estão as referências (os vínculos)
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        // Formatador para a data aparecer como 20/05/2026 14:30 em vez de 2026-05-20T14:30
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return "=== DADOS DA CONSULTA ===\n" +
                "Data: " + data.format(formato) + "\n" +
                "Valor: R$ " + valorDaConsulta + "\n" +
                medico.toString() + "\n" +
                paciente.toString() + "\n" +
                "=========================";
    }
}