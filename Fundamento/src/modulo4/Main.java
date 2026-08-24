package modulo4;
import java.util.Scanner;

// Crie um programa que receba 3 notas de um aluno e calcule a média.
// O programa deverá:
// >Ler as três notas utilizando Scanner;
// >Calcular a média;
// >Exibir a média com duas casas decimais;
// >Informar:
//  - "Aprovado", se a média for maior ou igual a 7;
//  - "Recuperação", se a média estiver entre 5 e 6,9;
//  - "Reprovado", se a média for menor que 5.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f%n", media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
