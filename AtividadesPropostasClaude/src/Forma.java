public abstract class Forma {
    private String nomeForma;

    public Forma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public abstract double calcularArea ();
}
