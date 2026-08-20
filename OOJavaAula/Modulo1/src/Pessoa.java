public class Pessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostra(){
        return "Nome: " + nome + " - Idade: " + idade;
    }
}
