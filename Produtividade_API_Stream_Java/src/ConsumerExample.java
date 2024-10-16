import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** 
 * Representa uma operação que aceita um argumento tipo T e não retorna
 * nenhum resultado.
 * É utilizado principalmente para realizar ações, ou efeitos colaterais nos
 * elementos do Stream sem modificar, ou retornar valor
 */

public class ConsumerExample {
    public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    //usar Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
        if (numero % 2 == 0){
            System.out.println(numero);
        }
    };

    // Consumer para imprimir os números pares no Stream
    numeros.stream().forEach(imprimirNumeroPar);
}
}
