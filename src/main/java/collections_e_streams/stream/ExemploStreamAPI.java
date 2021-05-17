package collections_e_streams.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        // cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Tiago");
        estudantes.add("Rafael");

        // retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // retorna o elemento com o maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // retorna o elemento com o menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // retorna os elementos que tem a letra 'R' no nome
        System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma noca coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").contains(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // retorna true se todos os elementos possuem a letra 'w' no nome
        System.out.println("Tem algum elemento com W no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // retorna true se algum dos elementos possui a letra 'a' minúsculo no nome
        System.out.println("Tem algum elemento com A minúsculo no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // retorna true se nenhum elemento possui a letra 'a' minúscula no nome
        System.out.println("Não tem nenhum elemento com A minúsculo no nome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // retorna o primeiro elemento da coleção, se existir
        System.out.println("Retorna o primeiro elemento da coleção");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // exemplo de operação encadeada
        System.out.println("Operação encadeada:");
        System.out.println(estudantes.stream().peek(System.out::println).map(estudante -> estudante.concat(" - ")
            .concat(String.valueOf(estudante.length()))).peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        //        .collect(Collectors.joining(", ")));
        //        .collect(Collectors.toSet()));
        //        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf(" - ") + 1)));
    }
}
