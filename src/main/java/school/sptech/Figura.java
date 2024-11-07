package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public Figura() {
    }

    ;

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "cor: " + cor + "\nespessura: " + espessura;
    }

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
