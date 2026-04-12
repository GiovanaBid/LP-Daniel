import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    // Vínculos (Associação)
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Regra do professor: mostrar dados do leitor e título do livro
        return "--- COMPROVANTE DE EMPRÉSTIMO ---\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Emprestado para: " + leitor.getNome() + "\n" +
                "Data de Saída: " + dataEmprestimo.format(dtf) + "\n" +
                "Devolução Prevista: " + dataDevolucaoPrevista.format(dtf) + "\n" +
                "---------------------------------";
    }
}