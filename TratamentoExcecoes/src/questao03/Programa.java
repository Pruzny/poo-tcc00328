package questao03;

import java.util.Scanner;

public class Programa {
    public static void executar() {
        Scanner teclado = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();
        int op = -1;
        do {
            menu();
            try {
                op = Integer.parseInt(teclado.nextLine());
                switch (op) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Nome:");
                        String nome = teclado.nextLine();
                        System.out.println("CPF:");
                        String cpf = teclado.nextLine();
                        cadastro.inserir(new Cliente(nome, cpf));
                        break;
                    case 2:
                        System.out.println("CPF:");
                        cpf = teclado.nextLine();
                        Cliente cliente = cadastro.buscar(cpf);
                        System.out.printf("%s: %s\n", cpf, cliente.getNome());
                        break;
                    case 3:
                        System.out.println("CPF para editar:");
                        cpf = teclado.nextLine();
                        cliente = cadastro.buscar(cpf);
                        menuEditar();
                        int editarOp = Integer.parseInt(teclado.nextLine());
                        switch (editarOp) {
                            case 1:
                                System.out.println("Novo CPF:");
                                cpf = teclado.nextLine();
                                cliente.setCpf(cpf);
                                break;
                            case 2:
                                System.out.println("Novo nome:");
                                nome = teclado.nextLine();
                                cliente.setNome(nome);
                                break;

                        }
                        break;
                }
            }
            catch (DadoInvalidoException | ClienteJaExisteException | RepositorioException | ClienteInexistenteException ex) {
                System.out.println(ex.getMessage());
            }
            catch (NumberFormatException ex) {
                System.out.println("Opcao invalida");
            }
        } while (op != 0);
    }

    private static void menu() {
        borda('=', 20);
        System.out.println("[0] - Encerrar");
        System.out.println("[1] - Inserir");
        System.out.println("[2] - Buscar");
        System.out.println("[3] - Editar");
        borda('=', 20);
        System.out.print("Op: ");
    }

    private static void menuEditar() {
        borda('-', 15);
        System.out.println("[0] - Cancelar");
        System.out.println("[1] - CPF");
        System.out.println("[2] - Nome");
        borda('-', 15);
        System.out.print("Op: ");
    }

    private static void borda(char c, int tam) {
        for (int i=0; i<tam; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
