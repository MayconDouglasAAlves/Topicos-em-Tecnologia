public class Pato extends Animal{

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Quack";
    }
}
