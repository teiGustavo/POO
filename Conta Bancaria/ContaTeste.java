import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double deposito;
        double saque;

        Conta minhaConta = new Conta();
        
        System.out.printf("O nome inicial é: %s%n", minhaConta.getNome());

        System.out.printf("Informe um nome: ");
        nome = entrada.nextLine();

        minhaConta.setNome(nome);

        System.out.println();
        System.out.printf("O novo nome é: %s%n", minhaConta.getNome());

        System.out.println();
        System.out.printf("O saldo inicial é: %2f%n", minhaConta.getSaldo());
        
        System.out.printf("Informe o depósito: ");
        deposito = entrada.nextDouble();

        minhaConta.deposito(deposito);

        System.out.printf("O saldo da conta é: %s%n", minhaConta.getSaldo());

        System.out.println();
        System.out.printf("Insira o saque: ");
        saque = entrada.nextDouble();

        minhaConta.saque(saque);

        System.out.printf("O saldo da conta é: %s%n", minhaConta.getSaldo());
    }
}