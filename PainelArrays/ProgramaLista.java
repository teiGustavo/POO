import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgramaLista {
    public static void main(String[] args) {
        JFrame Janela = new JFrame("Craps");
        
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Janela.setSize(600, 400);
        Janela.setLocationRelativeTo(null);
        
        JPanel Painel = new JPanel();
        Janela.add(Painel);

        JButton botaoN1 = new JButton("N1");
        Painel.add(botaoN1);

        JButton botaoN2 = new JButton("N2");
        Painel.add(botaoN2);

        JButton botaoN3 = new JButton("N3");
        Painel.add(botaoN3);

        JButton botaoN4 = new JButton("N4");
        Painel.add(botaoN4);

        JLabel saidasJogo = new JLabel();
        Painel.add(saidasJogo);

        ButtonHandler handler = new ButtonHandler(Painel, botaoN1, botaoN2, botaoN3, botaoN4, saidasJogo);
        botaoN1.addActionListener(handler);
        botaoN2.addActionListener(handler);
        botaoN3.addActionListener(handler);
        botaoN4.addActionListener(handler);

        Janela.pack();
        Janela.setVisible(true);
    }
}
