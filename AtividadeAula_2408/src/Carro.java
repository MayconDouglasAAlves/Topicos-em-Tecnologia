public class Carro extends Veiculo {

    public void setQuantidadePortas(int quantidadeportas) {
        this.quantidadeportas = quantidadeportas;
    }

    private int quantidadeportas;

    @Override
    public String mostra() {
        String aux = super.mostra();
        aux += "\nQuantidade Portas: " + quantidadeportas;
        return aux;
    }
}