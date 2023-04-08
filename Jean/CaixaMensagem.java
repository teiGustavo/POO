import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaixaMensagem{
    public static void main(String[] args){

       String nome = JOptionPane.showInputDialog("Qual seu nome?");
    
       String mensagem = String.format("%s, bem-vind@ à programação Java!", nome);

       JOptionPane.showMessageDialog(null, mensagem);
    }
}