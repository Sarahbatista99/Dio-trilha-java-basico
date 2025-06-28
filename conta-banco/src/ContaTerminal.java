import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual o número da sua agência?");
        String agencia = scanner.next();

        System.out.println("Qual o número da sua conta bancária?");
        int conta = scanner.nextInt();

        System.out.println("Qual seu saldo bancário?");
        float saldo = scanner.nextFloat();

        System.out.printf(
            "Olá %s, o número da sua conta bancária é %d, a agência é %s e o saldo disponível é R$ %.2f%n",
            nome, conta, agencia, saldo);
    }
}