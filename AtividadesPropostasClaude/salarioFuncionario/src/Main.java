public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Ana", 5000);
        Funcionario f2 = new Vendedor("Bruno", 2000, 15000);

        System.out.println(f1.getNome() + " ganha: " + f1.calcularSalario());
        System.out.println(f2.getNome() + " ganha: " + f2.calcularSalario());

        System.out.println(f1.dadosBasicos());
        System.out.println(((Vendedor) f2).getVendas());
    }
}

/*
Saída esperada:
Ana ganha: 6500.0
Bruno ganha: 3500.0
Funcionário: Ana | Salário base declarado na classe
Funcionário: Bruno | Salário base declarado na classe
15000.0
*/