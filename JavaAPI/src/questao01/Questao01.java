package questao01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Questao01 {
    public static void questao01() {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<String>();
        
        
        System.out.println("Minha Lista de Compras");
        System.out.println("obs:(para encerrar, digite 'sair')");
        String produto;
        do {
            System.out.println("Digite o nome do produto: ");
            produto = teclado.next();
            if (!produto.equalsIgnoreCase("sair")) {
                if (!lista.contains(produto)) {
                    lista.add(produto);
                } else {
                    System.out.println("Produto já está na lista.");
                }
            }
        } while (!produto.equalsIgnoreCase("sair"));
        imprimirListaCompras(lista);
    }
    
    public static void imprimirListaCompras(ArrayList<String> lista) {
        ArrayList<String> compras = (ArrayList<String>) lista.clone();
        Collections.sort(compras);
        System.out.println("Lista finalizada:");
        for (String nome: compras) {
            System.out.println(nome);
        }
    }
}

