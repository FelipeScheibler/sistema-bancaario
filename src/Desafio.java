import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double valorReceber;
        double valorEnviar;

        String nome = "Felipe Scheibler";
        String tipoConta = "Corrente";
        double saldo = 5500.00;

        System.out.println("****************************************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n****************************************");

        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println("\nDigite a opção desejada:");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor á receber: ");
                valorReceber = scanner.nextInt();
                saldo += valorReceber;
                System.out.println("Seu saldo atual é " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor á ser enviado: ");
                valorEnviar = scanner.nextInt();
                if (valorEnviar > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valorEnviar;
                    System.out.println("Seu saldo atual é: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}