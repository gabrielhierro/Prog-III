package exercicio3;

import java.util.Scanner;

public class MainExercicio3 {
    public static void main(String[] args) {
        System.out.println("\n--- Exercício 3: Interface para Dispositivos Eletrônicos ---");
        Scanner scanner = new Scanner(System.in);

        Smartphone meuSmartphone = new Smartphone();
        Televisao minhaTelevisao = new Televisao();

        int opcaoDispositivo;
        int opcaoAcao;

        do {
            System.out.println("\nEscolha um dispositivo:");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisão");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcaoDispositivo = scanner.nextInt();

            if (opcaoDispositivo == 1 || opcaoDispositivo == 2) {
                System.out.println("Escolha uma ação:");
                System.out.println("1. Ligar");
                System.out.println("2. Desligar");
                System.out.print("Opção: ");
                opcaoAcao = scanner.nextInt();

                if (opcaoDispositivo == 1) { // Smartphone
                    if (opcaoAcao == 1) {
                        meuSmartphone.ligar();
                    } else if (opcaoAcao == 2) {
                        meuSmartphone.desligar();
                    } else {
                        System.out.println("Opção de ação inválida.");
                    }
                } else { // Televisão
                    if (opcaoAcao == 1) {
                        minhaTelevisao.ligar();
                    } else if (opcaoAcao == 2) {
                        minhaTelevisao.desligar();
                    } else {
                        System.out.println("Opção de ação inválida.");
                    }
                }
            } else if (opcaoDispositivo != 0) {
                System.out.println("Opção de dispositivo inválida.");
            }

        } while (opcaoDispositivo != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}