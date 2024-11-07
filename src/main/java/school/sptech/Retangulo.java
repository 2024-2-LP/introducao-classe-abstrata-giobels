package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Retangulo(String cor, Integer espessura, Double altura, Double base) {
        super(cor, espessura);
        this.altura = altura;
        this.base = base;
    }

    public Retangulo() {}

    @Override
    public Double calcularArea() {
        return base*altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
