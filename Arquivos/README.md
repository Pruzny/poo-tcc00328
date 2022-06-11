Exercícios - Arquivos


1. [5 pontos]Complemente o exercício 3 sobre tratamento de exceções para persistir os dados dos clientes em um arquivo. Você deverá implementar a classe ClienteArquivo que:
* Deve possuir o método inserir que recebe um objeto da classe Cliente como parâmetro e armazena essas informações em um arquivo externo
* Deve conter o método buscarPorCPF e buscarPorNome que faz a busca de um cliente por CPF e nome, respectivamente, no arquivo externo. O método buscarPorCPF retornará apenas um cliente. O método buscarPorNome pode retornar mais de um cliente.
* Deve conter o método listar, que retornará todos os clientes armanezados no arquivo.
* Deve conter o método excluir que receberá um CPF como parâmetro e excluirá o cliente com esse CPF do arquivo.


Além disso, modifique a classe CadastroCliente:
* O método inserir deverá chamar o método inserir de ClienteArquivo para que possa armazenar o cliente em arquivo
* O método buscar deverá chamar o método buscar de ClienteArquivo
* Adicione o método listar, que deverá consultar o método listar de ClienteArquivo, para imprimir todos os clientes na tela
* Adicione o método excluir, que recebe um CPF como parâmetro e chama o método excluir de ClienteArquivo


* Crie também a classe TelaCliente que:
* Possui o método criaMenu, que imprime na tela o menu para o usuário com as opções:
   * 1 - Cadastrar novo cliente
   * 2 - Buscar cliente pelo nome
   * 3 - Buscar cliente pelo CPF
   * 4 - Excluir cliente
   * 5 - Listar cliente
Para cada opção do menu, solicitar para o usuário os dados necessários do cliente e invocar o método correspondente da classe CadastroCliente.
Ao final da execução da opção selecionada, deverá ser exibido na tela o retorno correspondente (ex: lista dos clientes encontrados, mensagens “Cliente cadastrado com sucesso” ou “Não foi possível cadastrar o cliente”).