import java.util.ArrayList;

public class CadastroCliente {

    static void inserir(Cliente novoCliente) {
        ClienteArquivo.inserir(novoCliente);
    }

    static Cliente buscar(String cpf) throws BuscaException {
        return ClienteArquivo.buscarPorCPF(cpf);
    }

    static ArrayList<Cliente> listar() throws BuscaException {
        return ClienteArquivo.listar();
    }

    static void excluir(String cpf) throws BuscaException {
        ClienteArquivo.excluir(cpf);
    }
}
