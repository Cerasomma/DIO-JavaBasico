import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T
 * e retorna um valor Booleano (verdadeiro ou falso)
 * É comumente utilizado para filtrar os elementos do Stream
 * com base em alguma condição
 */

public class PredicateExample {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("C++", "Phyton", "Java", "Delphi", "Kotlin", "Go", "Ruby", "JavaScript");
        
        //Criar um Predicate que verifica se a palavra tem mais de cinco caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;  

        //Usar o Stream para filtrar palavras com mais de cinco caracteres, e me seguida
        //Imprimir cada palavra que passou no filtro
        palavras.stream().filter(maisDeCincoCaracteres).forEach(p -> System.out.println(p));
    }
}
