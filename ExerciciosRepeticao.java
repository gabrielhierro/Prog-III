import java.util.Scanner;

public class ExerciciosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercício 1: Soma dos N primeiros números naturais
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
        
        // Exercício 2: Tabuada de um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();
        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        
        // Exercício 3: Contagem regressiva usando do-while
        System.out.print("Digite um número para a contagem regressiva: ");
        int contagem = scanner.nextInt();
        do {
            System.out.println(contagem);
            contagem--;
        } while (contagem >= 0);
        
        // Exercício 4: Média de notas de uma turma
        System.out.print("Digite a quantidade de alunos na turma: ");
        int qtdAlunos = scanner.nextInt();
        double somaNotas = 0;
        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            somaNotas += scanner.nextDouble();
        }
        double media = somaNotas / qtdAlunos;
        System.out.println("A média da turma é: " + media);
        
        // Exercício 5: Números primos em um intervalo
        System.out.print("Digite o primeiro número do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o último número do intervalo: ");
        int fim = scanner.nextInt();
        
        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
        for (int num = inicio; num <= fim; num++) {
            boolean ehPrimo = true;
            if (num < 2) {
                ehPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
