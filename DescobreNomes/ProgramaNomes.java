import javax.swing.*;

public class ProgramaNomes 
{
    public static void main(String[] args) {
        JFrame Janela = new JFrame("Procurar Nomes");

        Janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Janela.setSize(600,400);
        Janela.setLocationRelativeTo(null);

        JPanel Painel = new JPanel();
        Janela.add(Painel);
        
        JTextField fieldNome = new JTextField(30);
        Painel.add(fieldNome);
        JButton botaoProcurar = new JButton("Começar");
        Painel.add(botaoProcurar);

        JLabel saidas = new JLabel("STATUS");
        Painel.add(saidas);
        
        ButtonHandler handler = new ButtonHandler(Painel, botaoProcurar, saidas);
        botaoProcurar.addActionListener(handler);

        //Janela.pack();
        Janela.setVisible(true);
    }
}