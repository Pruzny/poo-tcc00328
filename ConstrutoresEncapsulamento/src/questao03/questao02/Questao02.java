package questao03.questao02;

import java.util.Scanner;

public class Questao02 {
    public static void questao02() {
        Pessoa jovem;
        jovem = criarPessoa();
        jovem.aniversario();
        mostrarIdade(jovem);
    }
    
    public static Pessoa criarPessoa() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idadeInicial = teclado.nextInt();
        return new Pessoa(nome, idadeInicial);
    }
    
    static void mostrarIdade(Pessoa p) {
        System.out.printf("%s agora tem %d anos.\n", p.getNome(), p.getIdadeFinal());
    }
}
