package exercicio1;

public class MainExercicio1 {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1: Interface para Pagamentos ---");

        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(150.75);
        boleto.realizarPagamento(500.00);
    }
}