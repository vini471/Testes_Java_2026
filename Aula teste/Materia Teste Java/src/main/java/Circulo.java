public class Circulo {

    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser positivo.");
        }

        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}