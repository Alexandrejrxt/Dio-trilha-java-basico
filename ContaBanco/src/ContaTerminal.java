import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        System.out.println("Por favor digite seu nome ! ");
        nomeCliente = scanner.next();

        System.out.println("Informe agora a Agência !");
        agencia = scanner.next();

        System.out.println("Informe o número da conta !");
        numero = scanner.nextInt();

        System.out.println("Quanto gostaria de depositar ?");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %S e seu saldo %.2f  já está disponível para saque.", nomeCliente, agencia, numero, saldo);

    }

}