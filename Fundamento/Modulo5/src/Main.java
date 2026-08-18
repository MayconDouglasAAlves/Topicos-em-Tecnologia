/*
Crie um programa que armazene 10 números inteiros em um vetor.
O programa deverá:
1. Solicitar os 10 números ao usuário;
2. Armazená-los em um vetor;
3. Exibir todos os números;
4. Ordenar o vetor utilizando Arrays.sort();
5. Exibir o vetor ordenado;
6. Informar a quantidade de elementos do vetor;
7. Informar o maior e o menor valor.
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}