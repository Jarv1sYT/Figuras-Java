public class TrianguloRectangulo {

    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public void determinarTipoTriangulo() {
        double hip = calcularHipotenusa();
        double tol = 1e-6;

        if (Math.abs(base - altura) < tol ||
            Math.abs(base - hip) < tol ||
            Math.abs(altura - hip) < tol) {
            System.out.println("El triángulo rectángulo es isósceles.");
        } else {
            System.out.println("El triángulo rectángulo es escaleno.");
        }
    }
}
