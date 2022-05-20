package questao03;

public class CadastroCliente {
    private Cliente[] clientes;
    private int tamanho;

    CadastroCliente() {
        this.clientes = new Cliente[10];
        this.tamanho = 0;
    }

    void inserir(Cliente novoCliente) {
        if (this.tamanho >= 10) {
            throw new RepositorioException();
        } else {
            for (int i=0; i<tamanho; i++) {
                if (this.clientes[i].equals(novoCliente)) {
                    throw new ClienteJaExisteException();
                }
            }
            this.clientes[this.tamanho] = novoCliente;
            this.tamanho++;
        }
    }

    Cliente buscar(String cpf) {
        for (int i=0; i<this.tamanho; i++) {
            if (this.clientes[i].getCpf().equalsIgnoreCase(cpf)) {
                return clientes[i];
            }
        }
        throw new ClienteInexistenteException();
    }
}
