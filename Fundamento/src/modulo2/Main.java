package modulo2;
/*
Altere o módulo 2 para ler valores do tipo double.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite x: ");
        double x = sc.nextDouble();
        System.out.print("Digite y: ");
        double y = sc.nextDouble();
        double z = x + y;
        System.out.println("A soma é " + z);
    }
}
