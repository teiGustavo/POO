import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.*;
import javax.swing.JPanel;

public class ProgramaCraps {
    public static void main(String[] args) {
        JFrame Janela = new JFrame("Craps");

        Janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Janela.setSize(600,400);
        Janela.setLocationRelativeTo(null);

        JPanel Painel = new JPanel();
        Janela.add(Painel);
        
        JButton botaoComecar = new JButton("Começar");
        Painel.add(botaoComecar);

        JLabel saidasJogo = new JLabel();
        Painel.add(saidasJogo);
        
        ButtonHandler handler = new ButtonHandler(Painel, botaoComecar, saidasJogo);
        botaoComecar.addActionListener(handler);

        Janela.setVisible(true);
    }
}
