public class Motocicleta extends Veiculo {

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    private int cilindradas;

    @Override
    public String mostra() {
        String aux = super.mostra();
        aux += "\nCilindradas: " + cilindradas;
        return aux;
    }
}