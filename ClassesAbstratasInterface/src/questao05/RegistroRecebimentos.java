package questao05;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroRecebimentos {
    public static void executar() {
        ArrayList<Recebivel> registros = new ArrayList<>();
        int op;
        Scanner teclado = new Scanner(System.in);
        do {
            mostrarMenu();
            op = Integer.parseInt(teclado.nextLine());
            switch (op) {
                case 0:
                    break;
                case 1:
                    int tipoOp;
                    do {
                        mostrarMenuRegistro();
                        tipoOp = Integer.parseInt(teclado.nextLine());
                        switch (tipoOp) {
                            case 0:
                                System.out.println("Registro cancelado");
                                break;
                            case 1:
                                System.out.println("Produto: ");
                                String produto = teclado.nextLine();
                                System.out.println("Quantidade: ");
                                int quantidade = Integer.parseInt(teclado.nextLine());
                                System.out.println("Preco unitario: ");
                                double precoUnitario = Double.parseDouble(teclado.nextLine());
                                registros.add(new ItemVenda(produto, quantidade, precoUnitario));
                                System.out.println("ItemVenda criado!");
                                break;
                            case 2:
                                System.out.println("Descricao: ");
                                String descricao = teclado.nextLine();
                                System.out.println("Horas: ");
                                int horas = Integer.parseInt(teclado.nextLine());
                                System.out.println("Preco hora: ");
                                double precoHora = Double.parseDouble(teclado.nextLine());
                                registros.add(new Servico(descricao, horas, precoHora));
                                System.out.println("Servico criado!");
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                        }
                    } while (tipoOp < 0 || tipoOp > 2);
                    break;
                case 2:
                    mostrarRegistros(registros);
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private static void mostrarMenu() {
        borda('=', 20);
        System.out.println("[0] - Encerrar");
        System.out.println("[1] - Registrar recebimento");
        System.out.println("[2] - Imprimir lista");
        borda('=', 20);
        System.out.print("Op: ");
    }

    private static void mostrarMenuRegistro() {
        borda('=', 20);
        System.out.println("[0] - Cancelar");
        System.out.println("[1] - ItemVenda");
        System.out.println("[2] - Servico");
        borda('=', 20);
        System.out.print("Op: ");
    }

    private static void borda(char c, int tam) {
        for (int i=0; i<tam; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void mostrarRegistros(ArrayList<Recebivel> registros) {
        for (Recebivel registro: registros) {
            System.out.println(registro);
            System.out.printf("R$%.2f\n", registro.totalizarReceita());
        }
    }
}
