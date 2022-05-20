package questao02;

public class TesteContaCorrente {
    public static void testar() {
        ContaCorrente minhaConta = new ContaCorrente();
        try {
            int op = 1;
            switch (op) {
                case 1:
                    minhaConta.sacar(-1);
                    break;
                case 2:
                    minhaConta.sacar(1);
                    break;
                case 3:
                    minhaConta.depositar(-1);
                    break;
            }
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
