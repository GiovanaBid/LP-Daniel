import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        // 1. Criar o Leitor e o Livro
        Leitor leitor1 = new Leitor(10, "Maria Oliveira");
        Livro livro1 = new Livro(500, "Java: Como Programar", "Deitel");

        // 2. Definir as datas
        LocalDate hoje = LocalDate.now(); // Pega a data de hoje
        LocalDate devolucao = hoje.plusDays(7); // Soma 7 dias automaticamente

        // 3. Criar a associação (O empréstimo vinculando leitor e livro)
        Emprestimo emp = new Emprestimo(hoje, devolucao, leitor1, livro1);

        // 4. Mostrar o resultado
        System.out.println(emp.toString());
    }
}