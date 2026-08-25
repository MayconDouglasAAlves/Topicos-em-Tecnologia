public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato: SEM corpo, só a assinatura, terminando em ;
    public abstract String emitirSom();
}