import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        // 1. Criamos os objetos independentes primeiro
        Medico med = new Medico(1, "Dr. Daniel Arantes", "Cardiologia");
        Paciente pac = new Paciente(50, "Sérgio Silva", "123.456.789-00");

        // 2. DESAFIO: Criar a data 20/05/2026 às 15:30
        // O LocalDateTime usa: (ano, mes, dia, hora, minuto)
        LocalDateTime dataDesejada = LocalDateTime.of(2026, 5, 20, 15, 30);

        // 3. Criamos a associação (a consulta) ligando tudo
        Consulta minhaConsulta = new Consulta(dataDesejada, 300.0f, med, pac);

        // 4. Imprimimos o resultado
        System.out.println(minhaConsulta.toString());
    }
}