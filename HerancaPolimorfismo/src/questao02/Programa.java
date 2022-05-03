package questao02;

import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
    public static void executar() {
        Agenda agenda = Agenda.getInstance();
        menu(agenda);
    }

    private static void menu(Agenda agenda) {
        Scanner teclado = new Scanner(System.in);

        String[] menuTags = {"Encerrar", "Adicionar contato", "Mostrar agenda", "Procurar contato"};
        boolean encerrar = false;
        while (!encerrar) {
            borda('=', 30);
            for (int i = 0; i < 4; i++) {
                System.out.printf("[%d] - %s\n", i, menuTags[i]);
            }
            borda('=', 30);
            System.out.print("Op: ");
            int op = Integer.parseInt(teclado.next());
            switch (op) {
                case 0:
                    encerrar = true;
                    break;
                case 1:
                    String[] addTags = {"Cancelar", "Pessoa fisica", "Pessoa juridica"};
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("[%d] - %s\n", i, addTags[i]);
                    }
                    op = Integer.parseInt(teclado.next());
                    switch (op) {
                        case 1:
                            agenda.addContato(criarPessoaFisica());
                            break;
                        case 2:
                            agenda.addContato(criarPessoaJuridica());
                    }
                    break;
                case 2:
                    mostrarAgenda(agenda);
                    break;
                case 3:
                    String[] procurarTags = {"Cancelar", "Pessoa fisica", "Pessoa juridica"};
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("[%d] - %s\n", i, procurarTags[i]);
                    }
                    op = Integer.parseInt(teclado.next());
                    switch (op) {
                        case 1:
                            System.out.println("CPF:");
                            String cpf = teclado.next();
                            agenda.procurarContato(cpf, "PessoaFisica");
                            break;
                        case 2:
                            System.out.println("CNPJ:");
                            String cnpj = teclado.next();
                            agenda.procurarContato(cnpj, "PessoaJuridica");
                            break;
                    }
                    break;
            }
        }
    }

    private static PessoaFisica criarPessoaFisica() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = teclado.nextLine();
        System.out.println("CPF:");
        String cpf = teclado.nextLine();
        System.out.println("Endereco:");
        String endereco = teclado.nextLine();
        System.out.println("Data de aniversario:");
        String aniversario = teclado.nextLine();
        System.out.println();

        return new PessoaFisica(endereco, nome, cpf, aniversario);
    }

    private static PessoaJuridica criarPessoaJuridica() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Razao social:");
        String razaoSocial = teclado.nextLine();
        System.out.println("CNPJ:");
        String cnpj = teclado.nextLine();
        System.out.println("Endereco:");
        String endereco = teclado.nextLine();
        System.out.println("Faturamento:");
        double faturamento = Double.parseDouble(teclado.next());
        System.out.println();

        return new PessoaJuridica(endereco, razaoSocial, cnpj, faturamento);
    }

    static void mostrarPessoaFisica(PessoaFisica pessoa) {
        System.out.printf(
                "Nome: %s\n"
                + "CPF: %s\n"
                + "Endereco: %s\n"
                + "Data de aniversario: %s\n",
                pessoa.getNome(),
                pessoa.getCpf(),
                pessoa.getEndereco(),
                pessoa.getAniversario()
        );
    }

    static void mostrarPessoaJuridica(PessoaJuridica pessoa) {
        System.out.printf(
                "Razao social: %s\n"
                + "CNPJ: %s\n"
                + "Endereco: %s\n"
                + "Faturamento: %.2f\n",
                pessoa.getRazaoSocial(),
                pessoa.getCnpj(),
                pessoa.getEndereco(),
                pessoa.getFaturamento()
        );
    }

    private static void mostrarAgenda(Agenda agenda) {
        ArrayList contatos = agenda.getContatos();
        for (Object contato : contatos) {
            borda('-', 25);
            if (contato.getClass().equals(PessoaFisica.class)) {
                Programa.mostrarPessoaFisica((PessoaFisica) contato);
            }
            if (contato.getClass().equals(PessoaJuridica.class)) {
                Programa.mostrarPessoaJuridica((PessoaJuridica) contato);
            }
        }
    }

    private static void borda(char letra, int tamanho) {
        for (int i=0; i<tamanho; i++) {
            System.out.printf("%c", letra);
        }
        System.out.println();
    }
}
