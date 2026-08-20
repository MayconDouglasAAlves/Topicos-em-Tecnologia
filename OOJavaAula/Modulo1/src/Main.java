import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medico m = new Medico();
        System.out.println("\nCadastro de Médico\n");
        cadastroPessoal(m, sc);
        System.out.print("CRM: ");
        m.setCrm(sc.nextLine());
        System.out.print("Especialidade: ");
        m.setEspecialidade(sc.nextLine());
        System.out.println("\n" + m.mostra());

        Paciente p = new Paciente();
        System.out.println("\nCadastro de Paciente\n");
        cadastroPessoal(p, sc);
        System.out.print("Plano: ");
        p.setPlano(sc.nextLine());
        System.out.println("\n" + p.mostra());
    }

    static void cadastroPessoal(Pessoa obj, Scanner sc) {
        System.out.print("Nome: ");
        obj.setNome(sc.nextLine());
        System.out.print("Idade: ");
        obj.setIdade(sc.nextInt());
        sc.nextLine();
    }
}