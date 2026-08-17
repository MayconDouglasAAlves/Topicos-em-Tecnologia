import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite x: ");
        int x = sc.nextInt();
        System.out.print("Digite y: ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("A soma é " + z);
    }
}