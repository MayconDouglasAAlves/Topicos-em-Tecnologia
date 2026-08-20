package modulo3;
/*
Uma loja possui o preço de um produto armazenado inicialmente como uma String.
Crie um programa que:
1. Declare uma variável String contendo o preço de um produto.
2. Converta esse valor para int utilizando Integer.parseInt().
3. Solicite ao usuário a quantidade de produtos comprados.
4. Calcule o valor total da compra.
5. Apresente o resultado na tela.
Exemplo:
Preço do produto: 25
Quantidade: 4
Valor total: R$ 100
Desafio: altere o programa para trabalhar com preços decimais utilizando double.
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

// Integer.parseInt(String)