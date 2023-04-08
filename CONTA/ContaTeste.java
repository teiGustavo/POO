import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContaTeste{
    public static void main(String[] args) {
        //Cria dois objetos do tipo Conta
        Conta conta1 = new Conta("Jean Henrique", 200);
        Conta conta2 = new Conta("Isaac Luiz", 100);

        //Exibe o saldo inicial de cada objeto
        conta1.exibeInformacoes();
        conta2.exibeInformacoes();

        //Cria um Scanner para obter o valor digitado pelo usuário
        Scanner entrada = new Scanner(System.in);

        String mensagem = String.format("Informe o depósito para a conta do %s: ", conta1.getNome());
        String valorDeposito = JOptionPane.showInputDialog(mensagem);
        float valDeposito = Float.parseFloat(valorDeposito);
        mensagem = String.format("Adicionando R$ %.2f a conta do %s...%n", valDeposito, conta1.getNome());
        JOptionPane.showMessageDialog(null, mensagem);
        conta1.deposito(valDeposito);

        //Exibe as informações da conta
        conta1.exibeInformacoes();
        conta2.exibeInformacoes();

        mensagem = String.format("Informe o depósito para a conta do %s: ", conta2.getNome());
        valorDeposito = JOptionPane.showInputDialog(mensagem);
        valDeposito = Float.parseFloat(valorDeposito);
        mensagem = String.format("Adicionando R$ %.2f a conta do %s...%n", valDeposito, conta2.getNome());
        JOptionPane.showMessageDialog(null, mensagem);
        conta2.deposito(valDeposito);

        //Exibe as informações da conta
        conta1.exibeInformacoes();
        conta2.exibeInformacoes();
        
    }
}

