import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTeste{
    public static void main(String[] args) {
        //Cria dois objetos do tipo Conta
        Conta conta1 = new Conta("Jean Henrique",200);
        Conta conta2 = new Conta("José Luiz",200);
        float saldof;
        String nome;
        String saldo;

        //conta 1
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        //exibe o nome
        conta1.setNome(nome);
        //pede para o usuário digitar o saldo da conta1 
        saldo = JOptionPane.showInputDialog("qual é o saldo da  sua conta ?");
        saldof = Float.parseFloat(saldo);//converte o saldo de String para Float
        conta1.setSaldo(saldof);//define o saldo para a conta 1
        //Exibe o saldo inicial de cada objeto
        conta1.exibeInformacoes();
        
        //conta 2
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        //exibe o nome
        conta2.setNome(nome);
        saldo = JOptionPane.showInputDialog("qual é o saldo da sua conta  conta ?");
        saldof = Float.parseFloat(saldo);//converte o saldo de String para Float
        conta2.setSaldo(saldof);//define o saldo para a conta 2
        //Exibe o saldo inicial de cada objeto
        conta2.exibeInformacoes();


        

        // lê o depósito
        String mensagem = String.format("Informe o depósito para a conta do %s: ", conta1.getNome());
        
        // lê o valor do deposito no formato de String

        String valor = JOptionPane.showInputDialog(mensagem);

        //Transforma a String para float

        float valorDeposito = Float.parseFloat(valor);

        //formata a mensagem para exibir para o usuario
        mensagem = String.format("Adicionando R$ %.2f a conta do %s...%n", valorDeposito, conta1.getNome());
        
        //exibe mensagem na caixa dialogo
        JOptionPane.showMessageDialog(null, mensagem);

        // adcionando o valor do depósito no saldo da conta 1
        conta1.deposito(valorDeposito);

        //Exibe as informações da conta
        conta1.exibeInformacoes();
        conta2.exibeInformacoes();
        


        // lê o depósito
         mensagem = String.format("Informe o depósito para a conta do %s: ", conta2.getNome());
        
        // lê o valor do deposito no formato de String

        valor = JOptionPane.showInputDialog(mensagem);

        //Transforma a String para float

        valorDeposito = Float.parseFloat(valor);

        //formata a mensagem para exibir para o usuario
        mensagem = String.format("Adicionando R$ %.2f a conta do %s...%n", valorDeposito, conta2.getNome());
        
        //exibe mensagem na caixa dialogo
        JOptionPane.showMessageDialog(null, mensagem);

        // adcionando o valor do depósito no saldo da conta 2
        conta2.deposito(valorDeposito);

        //Exibe as informações da conta
        conta1.exibeInformacoes();
        conta2.exibeInformacoes();




    }
}

