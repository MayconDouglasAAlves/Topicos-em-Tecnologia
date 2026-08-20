public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String mostra(){
        String aux = super.mostra();
        aux += "\nCRM: " + crm + "\nEspecialidade: " + especialidade;
        return aux;
    }
}
