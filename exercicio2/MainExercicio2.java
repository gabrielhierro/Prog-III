

import java.util.Scanner;

public class MainExercicio2 {
    public static void main(String[] args) {
        System.out.println("\n--- Exercício 2: Interface para Formas Geométricas ---");
        Scanner scanner = new Scanner(System.in);

        // Retângulo
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.printf("Área do Retângulo: %.2f\n", retangulo.calcularArea());
        System.out.printf("Perímetro do Retângulo: %.2f\n", retangulo.calcularPerimetro());

        System.out.println(); // Linha em branco para melhor leitura

        // Círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);
        System.out.printf("Área do Círculo: %.2f\n", circulo.calcularArea());
        System.out.printf("Perímetro do Círculo: %.2f\n", circulo.calcularPerimetro());

        scanner.close();
    }
}