package lista1;

import java.util.Scanner;

public class IdadeParaDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int idade = sc.nextInt();

        int dias = idade * 365;

        System.out.println("Você já viveu aproximadamente " + dias + " dias.");

        sc.close();
    }
}
