package functionalInterface.BinaryExample;

import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
    // Criar um BinaryOperator para somar números inteiros usando classes anônimos
    BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer num1, Integer num2) {
            return num1 + num2;
        }
    };

    // Usar o BinaryOperator para somar dois números
    int numero1 = 28;
    int numero2 = 37;
    int resultado = somar.apply(numero1, numero2);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}
