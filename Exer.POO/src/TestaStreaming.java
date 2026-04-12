public class TestaStreaming {
    public static void main(String[] args) {
        Streaming netflix = new Streaming("Daniel", "Premium");
        System.out.println(netflix.toString());

        netflix.assistirFilme("Matrix");
        System.out.println(netflix.toString());

        netflix.cancelarAssinatura();
        netflix.assistirFilme("Vingadores"); // Vai dar erro porque foi cancelado
    }
}