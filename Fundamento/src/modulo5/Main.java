//Crie um programa que armazene 10 números inteiros em um vetor.
//O programa deverá:
//        1. Solicitar os 10 números ao usuário;
//2. Armazená-los em um vetor;
//3. Exibir todos os números;
//4. Ordenar o vetor utilizando Arrays.sort();
//5. Exibir o vetor ordenado;
//6. Informar a quantidade de elementos do vetor;
//7. Informar o maior e o menor valor.

package modulo5;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i ++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Números adicionados: ");
        for (int i = 0; i < 10; i ++) {
            System.out.print(numeros[i] + " ");
        }

        Arrays.sort(numeros);
        System.out.println();

        System.out.print("Números ordenados: ");
        for (int i = 0; i < 10; i ++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de elementos: " + numeros.length);

        System.out.println("Menor valor adicionado: " + numeros[0]);

        System.out.println("Maior valor adicaionado: " + numeros[numeros.length - 1]);
    }
}