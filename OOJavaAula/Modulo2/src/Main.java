//Tarefa: Desenvolva as classes necessárias (com herança, polimorfismo)
// para que o programa abaixo, funcione corretamente.

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", "Vira-lata");
        Animal a2 = new Pato("Donald");

        System.out.println(a1.getNome() + " faz: " + a1.emitirSom() + " | Raça: " + ((Cachorro)a1).getRaca());
        System.out.println(a2.getNome() + " faz: " + a2.emitirSom());
    }
}

/*
Saída:
Rex faz: Au Au | Raça: Vira-lata
Donald faz: Quack
*/