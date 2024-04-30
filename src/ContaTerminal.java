import java.util.Locale;
import java.util.Scanner;

/**
* Esta classe representa um programa simples de terminal para criar uma conta bancária.
* O programa solicita ao usuário informações pessoais e imprime uma mensagem de boas-vindas
* junto com um resumo das informações fornecidas.
* @author  Kevyn Rodrigues
* @version 1.0
* @since   30/04/2024
*/

public class ContaTerminal {
    /**
     * O método principal que inicia a execução do programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste programa)
     * @throws Exception Exceção lançada em caso de erro durante a execução do programa
     */
    public static void main(String[] args) throws Exception {
        
        // Scanner para dados de usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicita ao usuário que digite seu nome
        System.out.println("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.next();
        
        // Solicita ao usuário que digite seu sobrenome
        System.out.println("Por favor, digite seu Sobrenome: ");
        String sobrenomeCliente = scanner.next();
        
        // Solicita ao usuário que digite o número da sua conta
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroDaConta = scanner.nextInt();
        
        // Solicita ao usuário que digite o número da sua agência
        System.out.println("Por favor, digite o número da sua Agência: ");
        int numeroDaAgencia = scanner.nextInt();
        
        // Solicita ao usuário que digite seu saldo
        System.out.println("Por favor, digite seu saldo: ");
        double saldoDaConta = scanner.nextDouble();

        // Impressão de boas-vindas e resumo do projeto
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência e número da conta são: " + numeroDaAgencia + " " + numeroDaConta);
        System.out.println("Seu saldo disponível para saque: " + saldoDaConta);
    }
}
