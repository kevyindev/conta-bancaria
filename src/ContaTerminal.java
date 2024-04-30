import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Scanner para dados de usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu Sobrenome: ");
        String sobrenomeCliente = scanner.next();
        System.out.println("Por favor, digiteo número da sua Conta: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Por favor, digiteo número da sua Agência: ");
        String numeroDaAgencia = scanner.next();
        System.out.println("Por favor, digiteo seu saldo: ");
        Double saldoDaConta = scanner.nextDouble();

        // Impressão de boas vindas e resolução do projeto
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência e número da conta é: " + numeroDaAgencia + numeroDaConta);
        System.out.println("Seu saldo disponível para saque: " + saldoDaConta);
    }
}
