package questao02;

import java.util.ArrayList;

public class Agenda {
    private static Agenda instance;
    private ArrayList contatos;
    
    private Agenda() {
        contatos = new ArrayList();
    }
    
    public static Agenda getInstance() {
        if (instance == null) {
            instance = new Agenda();
        }
        return instance;
    }
    
    public void procurarContato(String key, String tipo) {
        boolean encontrou = false;
        if (tipo.equalsIgnoreCase("PessoaFisica")) {
            for (int i=0; i<contatos.size() && !encontrou; i++) {
                if (contatos.get(i).getClass().equals(PessoaFisica.class)) {
                    PessoaFisica contato = (PessoaFisica) contatos.get(i);
                    if (contato.getCpf().equalsIgnoreCase(key)) {
                        encontrou = true;
                        Programa.mostrarPessoaFisica(contato);
                    }
                }
            }
        } else if (tipo.equalsIgnoreCase("PessoaJuridica")) {
            for (int i=0; i<contatos.size() && !encontrou; i++) {
                if (contatos.get(i).getClass().equals(PessoaJuridica.class)) {
                    PessoaJuridica contato = (PessoaJuridica) contatos.get(i);
                    if (contato.getCnpj().equalsIgnoreCase(key)) {
                        encontrou = true;
                        Programa.mostrarPessoaJuridica(contato);
                    }
                }
            }
        }
        if (!encontrou) {
            System.out.println("Contato nao encontrado");
        }
    }


    public void addContato(PessoaFisica pessoa) {
        contatos.add(pessoa);
    }

    public void addContato(PessoaJuridica pessoa) {
        contatos.add(pessoa);
    }

    public ArrayList getContatos() {
        return contatos;
    }
}
