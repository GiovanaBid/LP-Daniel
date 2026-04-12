public class TestaProjeto {
    public static void main(String[] args) {
        // 1. Criar os programadores (objetos independentes)
        Programador p1 = new Programador(1, "Ana Silva", "Java");
        Programador p2 = new Programador(2, "Carlos Java", "Python");
        Programador p3 = new Programador(3, "Beatriz Dev", "JavaScript");

        // 2. Criar o Projeto
        Projeto meuApp = new Projeto(101, "Sistema de Loja Online");

        // 3. Agregar os programadores ao projeto
        meuApp.adicionarProgramador(p1);
        meuApp.adicionarProgramador(p2);
        meuApp.adicionarProgramador(p3);

        // 4. Testar o método de listagem
        meuApp.listarEquipe();
    }
}