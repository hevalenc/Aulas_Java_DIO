package collections_e_streams.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // pegar o primeiro item da lista removendo-o da fila
        String clienteSeraAtendido = filaBanco.poll();

        System.out.println(clienteSeraAtendido);

        System.out.println(filaBanco);

        // pegar o primeiro item da lista sem removê-lo da fila
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        // parecidocom o peek, porém se a fila está vazia, será retornado erro
        String primeiroClienteEscolhido = filaBanco.element();

        System.out.println(primeiroClienteEscolhido);

        System.out.println(filaBanco);

        for (String cliente: filaBanco){
            System.out.println(" ** " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println(" == " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        // o item inserido será o último da fila
        filaBanco.add("Wesley");

        System.out.println(filaBanco);

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        // fila vazia retornará o valor null
        String teste = filaBanco.poll();

        System.out.println(teste);

    }
}
