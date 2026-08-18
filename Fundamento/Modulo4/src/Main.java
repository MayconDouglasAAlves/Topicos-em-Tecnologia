/*
Crie um programa que receba 3 notas de um aluno e calcule a média.
O programa deverá:
 Ler as três notas utilizando Scanner;
 Calcular a média;
 Exibir a média com duas casas decimais;
 Informar:
o "Aprovado", se a média for maior ou igual a 7;
o "Recuperação", se a média estiver entre 5 e 6,9;
o "Reprovado", se a média for menor que 5.
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