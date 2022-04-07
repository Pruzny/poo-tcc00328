import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa jovem;
        jovem = criarPessoa();
        jovem.aniversario();
        mostrarIdade(jovem);
    }
    
    public static Pessoa criarPessoa() {
        Scanner teclado = new Scanner(System.in);
        Pessoa aniversariante = new Pessoa();
        System.out.println("Digite o nome da pessoa:");
        aniversariante.nome = teclado.nextLine();
        System.out.println("Digite a idade da pessoa:");
        aniversariante.idadeInicial = teclado.nextInt();
        
        return aniversariante;
    }
    
    static void mostrarIdade(Pessoa p) {
        System.out.printf("%s agora tem %d anos.\n", p.nome, p.idadeFinal);
    }
}
