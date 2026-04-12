public class TestaEdificio {
    public static void main(String[] args) {
        Edificio residencial = new Edificio("Franca Tower", "Av. Major Nicácio, 123");

        // O dono do prédio manda construir os apartamentos passando só os números
        residencial.construirApartamento(101, 1);
        residencial.construirApartamento(202, 2);
        residencial.construirApartamento(1503, 15);

        residencial.listarApartamentos();
    }
}