import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TelaCliente {
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int op = -1;
        do {
            mostrarMenu();
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
                        CadastroCliente.inserir(new Cliente(nome, cpf));
                        System.out.println("Cliente inserido com sucesso");
                        break;
                    case 2:
                        System.out.println("CPF:");
                        cpf = teclado.nextLine();
                        System.out.println(CadastroCliente.buscar(cpf));
                        break;
                    case 3:
                        System.out.println("Nome:");
                        nome = teclado.nextLine();
                        for (Cliente cliente: ClienteArquivo.buscarPorNome(nome)) {
                            System.out.println(cliente);
                        }
                        break;
                    case 4:
                        System.out.println("CPF:");
                        cpf = teclado.nextLine();
                        CadastroCliente.excluir(cpf);
                        System.out.println("Cliente excluido com sucesso");
                        break;
                    case 5:
                        for (Cliente cliente: ClienteArquivo.listar()) {
                            System.out.println(cliente);
                        }
                }
            }
            catch (DadoException | InsercaoException | BuscaException ex) {
                System.out.println(ex.getMessage());
            }
            catch (NumberFormatException ex) {
                System.out.println("Opcao invalida");
            }
        } while (op != 0);
    }

    private static void mostrarMenu() {
        borda('=', 20);
        System.out.println("[0] - Encerrar");
        System.out.println("[1] - Inserir");
        System.out.println("[2] - Buscar CPF");
        System.out.println("[3] - Buscar nome");
        System.out.println("[4] - Excluir");
        System.out.println("[5] - Listar");
        borda('=', 20);
        System.out.print("Op: ");
    }

    private static void borda(char c, int tam) {
        for (int i=0; i<tam; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void teste() {
        try {
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream("clientes.dados"));
            ArrayList<Cliente> novaLista = (ArrayList<Cliente>) arqEntrada.readObject();
            arqEntrada.close();
            for (Cliente cliente: novaLista) {
                System.out.println("Cliente:");
                System.out.println(cliente);
            }
            System.out.println("Fim");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
