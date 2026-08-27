public class Main {
    public static void main(String[] args) {

        Forma f1 = new Retangulo(4, 5);
        Forma f2 = new Circulo(3);

        System.out.println("Área do f1: " + f1.calcularArea());
        System.out.println("Área do f2: " + f2.calcularArea());

        System.out.println("Nome da forma f1: " + f1.getNomeForma());
        System.out.println("Largura do retângulo: " + ((Retangulo) f1).getLargura());
    }
}

/*
Saída esperada:
Área do f1: 20.0
Área do f2: 28.27
Nome da forma f1: Retângulo
Largura do retângulo: 4.0
*/