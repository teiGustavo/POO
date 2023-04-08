import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTeste{
    public static void main(String[] args) {
        //Cria dois objetos do tipo Conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        float saldof;
        String nome;
        String saldo;
        String mensagem;

        //Conta 1
        nome = JOptionPane.showInputDialog("Nome da conta 1");
        conta1.setNome(nome);

        saldo = JOptionPane.showInputDialog("Saldo da conta 1");
        saldof = Float.parseFloat(saldo);
        conta1.setSaldo(saldof);

        //Conta 2
        nome = JOptionPane.showInputDialog("Nome da conta 2");
        conta2.setNome(nome);

        saldo = JOptionPane.showInputDialog("Saldo da conta 1");
        saldof = Float.parseFloat(saldo);
        conta2.setSaldo(saldof);

        //Exibe o saldo inicial da conta 1
        mensagem = String.format("Saldo da conta do %s: %.2f%n", conta1.getNome(), conta1.getSaldo());
        JOptionPane.showMessageDialog(null, mensagem);

        //Exibe o saldo inicial da conta 2
        mensagem = String.format("Saldo da conta do %s: %.2f%n", conta2.getNome(), conta2.getSaldo());
        JOptionPane.showMessageDialog(null, mensagem);


        //Cria um Scanner para obter o valor digitado pelo usuário
        Scanner entrada = new Scanner(System.in);

            System.out.printf("Informe o depósito para a conta do %s: ", conta1.getNome());
            float valorDeposito = entrada.nextFloat();
            System.out.printf("Adicionando R$ %.2f a conta do %s...%n", valorDeposito, conta1.getNome());
            conta1.deposito(valorDeposito);

            //Exibe as informações da conta
            System.out.printf("Saldo da conta do %s: %.2f %n", conta1.getNome(), conta1.getSaldo());
            System.out.printf("Saldo da conta do %s: %.2f %n%n", conta2.getNome(), conta2.getSaldo());

            System.out.printf("Informe o depósito para a conta do %s: ", conta2.getNome());
            valorDeposito = entrada.nextFloat();
            System.out.printf("Adicionando R$ %.2f a conta do %s...%n", valorDeposito, conta2.getNome());
            conta2.deposito(valorDeposito);

        //Exibe as informações da conta
        System.out.printf("Saldo da conta do %s: %.2f %n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("Saldo da conta do %s: %.2f %n", conta2.getNome(), conta2.getSaldo());

    }

    private static Conta setNome(String nome) {
        return null;
    }
}

