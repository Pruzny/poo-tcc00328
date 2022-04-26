/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03.ic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ListaMembros {
    public static ArrayList membros = new ArrayList(Arrays.asList(
            new Aluno("1", "Pedro", "pedro@id.uff.br"),
            new Aluno("2", "Marcos", "marcos@id.uff.br"),
            new Aluno("3", "Beto", "roberto@id.uff.br"),
            new Professor("4", "Vania", "vania@ic.uff.br"),
            new Professor("5", "Bruno", "bruno@ic.uff.br")
    ));
}
