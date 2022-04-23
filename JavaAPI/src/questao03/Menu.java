package questao03;

import java.util.*;
import java.text.DateFormat;

public class Menu {
    private Locale idioma = new Locale("pt", "BR");
    private int formato = DateFormat.DEFAULT;

    void escolher(int op, Agenda agenda) {
        switch (op) {
            case 0:
                break;
            case 1: // Mostrar compromissos em algum dia
                mostrarCompromissos(agenda);
                break;
            case 2: // Adicionar compromisso
                criarCompromisso(agenda);
                break;
            case 3: // Mudar idioma
                mudarIdioma();
                break;
            case 4: // Mudar formato
                mudarFormato();
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }

    void mostrarOpcoes() {
        borda(0, 15);
        System.out.println("[0] - Encerrar");
        System.out.println("[1] - Mostrar dia");
        System.out.println("[2] - Criar compromisso");
        System.out.println("[3] - Trocar idioma");
        System.out.println("[4] - Trocar formato de data");
        borda(0, 15);
        System.out.printf("Op: ");
    }

    void mostrarCompromissos(Agenda agenda) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Data (DD/MM/YYYY): ");
        String[] input = teclado.next().split("/");
        ArrayList<Integer> data = new ArrayList<>();
        for (String num: input) {
            data.add(Integer.parseInt(num));
        }

        Calendar diaProcurado = Calendar.getInstance();
        diaProcurado.set(data.get(2), data.get(1) - 1, data.get(0));
        DateFormat padraoDia = DateFormat.getDateInstance(formato, idioma);

        borda(1, 15);
        System.out.printf("%s\n\n", padraoDia.format(diaProcurado.getTime()));

        ArrayList<Compromisso> horarios = agenda.verificarDia(data.get(0), data.get(1) - 1, data.get(2));

        if (horarios.isEmpty()) {
            System.out.println("Nenhum compromisso marcado.");
        } else {
            DateFormat padraoHora = DateFormat.getTimeInstance(formato, idioma);
            for (Compromisso compromisso: horarios) {
                System.out.printf("%s: ", padraoHora.format(compromisso.getData().getTime()));
                System.out.printf("%s (%s) / Local: %s\n", compromisso.getTitulo(), compromisso.getDescricao(), compromisso.getLocal());
            }
        }
        borda(1, 15);
    }

    void criarCompromisso(Agenda agenda) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Titulo: ");
        String titulo = teclado.nextLine();
        System.out.printf("Descricao: ");
        String descricao = teclado.nextLine();
        System.out.printf("Local: ");
        String local = teclado.nextLine();

        System.out.printf("Data (DD/MM/YYYY) : ");
        String[] input = teclado.nextLine().split("/");
        ArrayList<Integer> dia = new ArrayList<>();
        for (String num: input) {
            dia.add(Integer.parseInt(num));
        }
        System.out.printf("Hora (hh:mm) : ");
        input = teclado.nextLine().split(":");
        ArrayList<Integer> hora = new ArrayList<>();
        for (String num: input) {
            hora.add(Integer.parseInt(num));
        }

        Calendar data = Calendar.getInstance();
        data.set(dia.get(2), dia.get(1) - 1, dia.get(0), hora.get(0), hora.get(1), 0);

        agenda.addCompromisso(titulo, descricao, local, data);
    }

    void mudarIdioma() {
        Scanner teclado = new Scanner(System.in);
        int op;
        do {
            borda(1, 15);
            System.out.println("[0] - Cancelar");
            System.out.println("[1] - Portugues");
            System.out.println("[2] - Ingles");
            borda(1, 15);

            System.out.printf("Op: ");
            op = teclado.nextInt();
            if (op == 1) {
                idioma = new Locale("pt", "BR");
            } else if (op == 2) {
                idioma = Locale.US;
            } else if (op != 0) {
                System.out.println("Opcao invalida");
            }
        } while (op < 0 || op > 2);
    }

    void mudarFormato() {
        Scanner teclado = new Scanner(System.in);
        int op;
        do {
            borda(1, 15);
            System.out.println("[0] - Cancelar");
            System.out.println("[1] - Curto");
            System.out.println("[2] - Normal");
            System.out.println("[3] - Longo");
            System.out.println("[4] - Completo");
            borda(1, 15);

            System.out.printf("Op: ");
            op = teclado.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    formato = DateFormat.SHORT;
                    break;
                case 2:
                    formato = DateFormat.MEDIUM;
                    break;
                case 3:
                    formato = DateFormat.LONG;
                    break;
                case 4:
                    formato = DateFormat.FULL;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (op < 0 || op > 4);

    }

    void borda(int op, int tamanho) {
        char texto = '_';
        switch (op) {
            case 0:
                texto = '=';
                break;
            case 1:
                texto = '-';
        }
        for (int i=0; i<tamanho; i++) {
            System.out.printf("%c", texto);
        }
        System.out.println();
    }
}
