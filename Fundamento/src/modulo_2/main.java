package modulo_2;

import java.util.Scanner;
public class main {
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
