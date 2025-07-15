import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //Nome do cliente
        System.out.println("Por favor, digite seu nome: ");
        String nome = scan.next();

        //Numero da conta do cliente
        System.out.println("Digite o número da conta: ");
        int num_conta = scan.nextInt();

        //Agencia
        System.out.println("Digite o número da agência: ");
        String num_agencia = scan.next();

        //Saldo
        System.out.println("Digite qual o valor desejado para saque: ");
        float saldo = scan.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.\n", nome, num_agencia, num_conta, saldo);
    }
}
