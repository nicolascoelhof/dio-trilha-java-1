import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Vamos criar sua conta.");
        System.out.print("Por favor, insira o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Agora, insira o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        double saldoInicial;
        System.out.print("Digite o saldo inicial: ");
        saldoInicial = scanner.nextDouble();
        if (saldoInicial < 0) {
            System.out.println("O saldo inicial não pode ser negativo. Por favor, insira um valor válido.");
            return;
        }

        String saldoFormatado = "R$ " + String.format("%.2f", saldoInicial);

        System.out.println("\nConta criada com sucesso!");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo Inicial: " + saldoFormatado);

        scanner.close();
        
    }
}
