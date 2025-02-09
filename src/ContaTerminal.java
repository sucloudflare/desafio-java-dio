import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura dos dados
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt(); // Leitura do número da conta

        // Limpeza do buffer de entrada
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Leitura da agência

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine(); // Leitura do nome do cliente

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble(); // Leitura do saldo

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
