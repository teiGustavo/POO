import javax.swing.JOptionPane;

public class CaixaMensagem {
    public static void main(String[] args) {
  
      String nome = JOptionPane.showInputDialog("Qual é seu nome?");
      String mensagem = String.format("Bem vindo, %s, à programação Java!", nome);
      JOptionPane.showMessageDialog(null, mensagem);

      Object[] options = { "Masc", "Fem"};
      int opcao = JOptionPane.showOptionDialog(null, "Por favor, selecioneo sexo", "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

      if (opcao == 0){
        mensagem = String.format("Masc");
        JOptionPane.showMessageDialog(null, mensagem);
      } else if (opcao == 1) {
        mensagem = String.format("Fem");
        JOptionPane.showMessageDialog(null, mensagem);
      }

    }
  }

