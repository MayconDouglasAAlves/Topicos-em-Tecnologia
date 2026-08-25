public class Veiculo {
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String mostra() {
        String aux = "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
        return aux;
    }

    private String marca;
    private String modelo;
    private int ano;
}
