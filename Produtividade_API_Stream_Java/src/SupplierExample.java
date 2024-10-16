import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum tipo de argumento e retorna
 * um resultado do tipo T. É comumente usado para criar ou fornecer novos objetos
 * de um determinado tipo.
 */

public class SupplierExample {
    public static void main(final String[] args) {
        //usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        final Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        //Usar o Supplier para obter uma lista com 5 saudações
        final List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5).collect(Collectors.toList());

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(n -> System.out.println(n));
        //Outra forma de imprimir
        listaSaudacoes.forEach(System.out::println);
    }
}
