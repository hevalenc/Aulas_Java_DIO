package collections_e_streams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // adiciona os itens na lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        System.out.println(nomes.get(0));

        // adiciona um item na lista em uma posição
        nomes.set(2, "Larissa");

        System.out.println(nomes);

        // ordenar a lista
        Collections.sort(nomes);

        System.out.println(nomes);

        // remover um item na lista através do índice
        nomes.remove(4);

        System.out.println(nomes);

        // remover um item da lista através do nome
        nomes.remove("Larissa");

        System.out.println(nomes);

        // pegar um item da lista e passar para uma variável
        String nome = nomes.get(1);

        System.out.println(nome);

        // capturar o tamanho da lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // verificar se um item está na lista - retorna true or false
        boolean temNome = nomes.contains("Anderson");

        System.out.println(temNome);

        temNome = nomes.contains("Maria");

        System.out.println(temNome);

        // verificar se a lista está vazia - retorna true or false
        boolean listaVazia = nomes.isEmpty();

        nomes.add("Joana");
        nomes.add("Wesley");
        Collections.sort(nomes);

        System.out.println(listaVazia);

        // retorna o indice do item
        int posicao = nomes.indexOf("Maria");

        System.out.println(nomes);
        System.out.println(posicao);

        posicao = nomes.indexOf("Mariana");

        // se retornar número negativo significa que o nome não está na lista
        System.out.println(posicao);

        // mostrar todos os itens da lista, um por linha
        for (String nomeDoItem: nomes){
            System.out.println(" ** " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println(" == " + iterator.next());
        }

        // limpar a lista
        nomes.clear();

        listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

    }

}
