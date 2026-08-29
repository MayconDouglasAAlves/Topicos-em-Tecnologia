public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo (double largura, double altura) {
        super("Retangulo");
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double calcularArea (){
        return (largura*altura);
    }

}
