//public class Cachorro extends Animal {
//    public Cachorro(String nome, String raca, String nome1) {
//        super(nome);
//        this.raca = raca;
//        this.nome = nome1;
//    }
//
//    private String nome;
//    private String raca;
//
//    public abstract String emitirSom(String nome; String raca) {
//        return System.out.println("Au Au");
//    }
//}

public class Cachorro extends Animal {
    private String raca; // só isso, nome NÃO se repete aqui

    public Cachorro(String nome, String raca) {
        super(nome); // manda o nome pro construtor de Animal
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }
}