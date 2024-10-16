import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna o resultado do tipo R.
 * É utilizado para transformar ou mapear elementos do Stream em outros valores
 * ou tipos. 
 */

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Imprimir a lista de números dobrados
        numeros.stream().map(dobrar).forEach(n -> System.out.println(n));
    }
}
