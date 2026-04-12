import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        // 1. Instanciar 2 objetos Filme
        Filme f1 = new Filme(1, "Batman", "Ação/Noir", 175);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        // 2. Instanciar Sessão (20/07/2026 às 20:00)
        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao01 = new Sessao(10, dataSessao, 1);

        // 3. Agregação: Vincular o filme "Batman"
        sessao01.vincularFilme(f1);

        // 4. Composição: Vender 3 ingressos
        sessao01.venderIngresso(501, "A1", "Inteira", 40.0f);
        sessao01.venderIngresso(502, "A2", "Meia", 20.0f);
        sessao01.venderIngresso(503, "A3", "Inteira", 40.0f);

        // 5. Imprimir estado final
        System.out.println(sessao01.toString());
    }
}