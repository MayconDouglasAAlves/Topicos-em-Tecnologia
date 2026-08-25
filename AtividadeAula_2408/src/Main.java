import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c = new  Carro();
        System.out.println("\nCadastro de carro\n");
        cadastroVeiculo(c, sc);
        System.out.print("Quantidade de portas: ");
        c.setQuantidadePortas (sc.nextInt());
        sc.nextLine();
        System.out.println("\n" + c.mostra());

        Motocicleta m = new Motocicleta();
        System.out.println("\nCadastro de Motocicleta\n");
        cadastroVeiculo (m, sc);
        System.out.print("Cilindradas: ");
        m.setCilindradas (sc.nextInt());
        sc.nextLine();
        System.out.println("\n" + m.mostra());
    }

    static void cadastroVeiculo(Veiculo obj, Scanner sc) {
        System.out.println("Marca: ");
        obj.setMarca (sc.nextLine());
        System.out.println("Modelo: ");
        obj.setModelo (sc.nextLine());
        System.out.println("Ano: ");
        obj.setAno (sc.nextInt());
        sc.nextLine();
    }
}