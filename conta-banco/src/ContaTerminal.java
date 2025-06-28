import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var nome = scanner.next();
        System.out.println("Olá, Qual o seu nome?");
        var Agencia = scanner.nextInt();
        System.out.println("Qual o número da sua agência ?");
        var Conta = scanner.nextInt();
        System.out.println("Qual o número da sua conta bancária? ");
        var Saldo = scanner.nextFloat();
        System.out.println("Qual seu saldo bancário?");
       
        System.out.println("Olá %S, o número da sua conta báncaria é %s e o número da sua agência é %s, o saldo bancário é de %s ?", nome, agencia, conta, saldo);

    }
}
