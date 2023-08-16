package functionalInterface.SupplierExample;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";
        // Criar um Supplier usando uma classe anonima para fornecer uma saudação personalizada
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)";
            }
        };

        // Usar o Supplier para obter a saudação
        String mensagemSaudacao = saudacao.get();
        System.out.println(mensagemSaudacao);
    }
}
