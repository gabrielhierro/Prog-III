import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercício 1: Verificação de Número Par ou Ímpar
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        
        // Exercício 2: Classificação de Idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade <= 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é idoso.");
        }
        
        // Exercício 3: Calculadora Simples com switch-case
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida. Tente novamente.");
        }
        
        // Exercício 4: Verificação de Ano Bissexto
        System.out.print("Digite um ano para verificar se é bissexto: ");
        int ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        
        // Exercício 5: Conversão de Notas para Conceito
        System.out.print("Digite uma nota entre 0 e 10: ");
        int nota = scanner.nextInt();
        if (nota >= 0 && nota <= 10) {
            String conceito;
            switch (nota) {
                case 9: case 10:
                    conceito = "A";
                    break;
                case 7: case 8:
                    conceito = "B";
                    break;
                case 5: case 6:
                    conceito = "C";
                    break;
                case 3: case 4:
                    conceito = "D";
                    break;
                default:
                    conceito = "E";
            }
            System.out.println("Conceito: " + conceito);
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
        
        scanner.close();
    }
}
