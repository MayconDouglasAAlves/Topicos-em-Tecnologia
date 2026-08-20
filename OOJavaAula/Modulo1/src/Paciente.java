public class Paciente extends Pessoa {
    private String plano;

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public String mostra(){
        String aux = super.mostra();
        aux += "\nPlano: " + plano;
        return aux;
    }
}
