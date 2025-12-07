public class Trapecio {

    private double baseMayor;
    private double baseMenor;
    private double lado;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double lado, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado = lado;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2.0) * altura;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + 2 * lado;
    }
}
