import java.io.*;
import java.util.ArrayList;

public class ClienteArquivo {
    private static final String PATH = "Arquivos/clientes.dados";

    public static ArrayList<Cliente> listar() {
        try {
            ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(PATH));
            ArrayList<Cliente> lista = (ArrayList<Cliente>) arquivo.readObject();
            arquivo.close();
            if (lista.size() > 0) {
                return lista;
            }
            throw new BuscaException("Nenhum cliente encontrado no arquivo.");
        } catch (FileNotFoundException ex) {
            throw new BuscaException("Arquivo nao encontrado.");
        } catch (IOException ex) {
            throw new BuscaException("Arquivo nao pode ser acessado.");
        } catch (ClassNotFoundException ex) {
            throw new BuscaException("Classe nao encontrada.");
        }
    }

    public static void inserir(Cliente novoCliente) throws InsercaoException {
        try {
            ArrayList<Cliente> lista;
            try {
                lista = listar();
            } catch (BuscaException ex) {
                String case1 = "Nenhum cliente encontrado no arquivo.";
                String case2 = "Arquivo nao encontrado.";
                if (ex.getMessage().equalsIgnoreCase(case1) || ex.getMessage().equalsIgnoreCase(case2)) {
                    lista = new ArrayList<>();
                } else {
                    throw ex;
                }
            }
            for (Cliente cliente: lista) {
                if (cliente.equals(novoCliente)) {
                    throw new InsercaoException("Cliente ja existe");
                }
            }
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(PATH));
            lista.add(novoCliente);
            arquivo.writeObject(lista);
            arquivo.close();
        } catch (IOException ex) {
            throw new InsercaoException("Arquivo nao pode ser acessado.");
        }
    }

    public static Cliente buscarPorCPF(String cpf) throws BuscaException {
        ArrayList<Cliente> lista = listar();
        for (Cliente cliente: lista) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return cliente;
            }
        }
        throw new BuscaException("Cliente nao encontrado no arquivo.");
    }

    public static ArrayList<Cliente> buscarPorNome(String nome) throws BuscaException {
        ArrayList<Cliente> lista = listar();
        ArrayList<Cliente> encontrados = new ArrayList<>();
        for (Cliente cliente: lista) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(cliente);
            }
        }
        if (encontrados.size() > 0) {
            return encontrados;
        }
        throw new BuscaException("Nenhum cliente encontrado no arquivo.");
    }

    public static void excluir(String cpf) {
        try {
            ArrayList<Cliente> lista = listar();
            if (lista.removeIf(cliente -> cliente.getCpf().equalsIgnoreCase(cpf))) {
                ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(PATH));
                arquivo.writeObject(lista);
                arquivo.close();
            } else {
                throw new BuscaException("Cliente nao encontrado no arquivo.");
            }
        } catch (FileNotFoundException ex) {
            throw new BuscaException("Arquivo nao encontrado.");
        } catch (IOException ex) {
            throw new BuscaException("Arquivo nao pode ser acessado.");
        }
    }
}
