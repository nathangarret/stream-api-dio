package functionalInterface.ConsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Criar um Consumer para imprimir cada número
        // numero -> System.out.println(numero);
        // Consumer<Integer> imprimirNumeros = System.out::println;
        Consumer<Integer> imprimirNumeros = new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir cada número no Stream
        numeros.stream().forEach(imprimirNumeros);
        // numeros.forEach(imprimirNumeros);
    }
}
