package questao03.ic;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaMembros {
    public static ArrayList membros = new ArrayList(Arrays.asList(
            new Aluno("1", "Pedro", "pedro@id.uff.br", "BCC"),
            new Aluno("2", "Marcos", "marcos@id.uff.br", "BCC"),
            new Aluno("3", "Beto", "roberto@id.uff.br", "BCC"),
            new Professor("4", "Vania", "vania@ic.uff.br", "TCC"),
            new Professor("5", "Bruno", "bruno@ic.uff.br", "TCC"),
            new Funcionario("6", "Sergio", "sergio@id.uff.br", "Porteiro")
    ));
}
