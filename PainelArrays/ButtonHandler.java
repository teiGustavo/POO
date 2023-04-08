import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonHandler implements ActionListener 
{
    private JPanel painel;
    private String msg = "";
    private JButton N1;
    private JButton N2;
    private JButton N3;
    private JButton N4;
    private JButton submit;
    private JLabel saidas;

    public ButtonHandler(JPanel Painel, JButton botaoN1, JButton botaoN2, JButton botaoN3, JButton botaoN4, JLabel saidasJogo) 
    {
        this.painel = Painel;
        this.N1 = botaoN1;
        this.N2 = botaoN2;
        this.N3 = botaoN3;
        this.N4 = botaoN4;
        this.saidas = saidasJogo;
    }

    public void ocultaBotoes() 
    {
        N1.setVisible(false);
        N2.setVisible(false);
        N3.setVisible(false);
        N4.setVisible(false);
    }

    public void atvN1() 
    {
        JFrame Janela2 = new JFrame("Atividade 1");

        Janela2.setSize(600,400);
        Janela2.setLocationRelativeTo(null);
        Janela2.setResizable(false);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel card1 = new JPanel() {
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += 100;
                return size;
            }
        };

        JPanel card2 = new JPanel();

        JLabel saidasCard1 = new JLabel();
        JLabel saidasCard2 = new JLabel();
        
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        
        int j = 9;
        
        msg += "<table border='1' style='margin-top: 10px;'>";
        msg += "<tr> <td>VETOR 1</td> </tr>";
        
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = i + 1;
            msg += String.format("<tr> <td>Posição %d do vetor 1: %d</td> </tr>", i, vet1[i]);
            vet2[j] = vet1[i];
            j--;
        }
        msg += "</table>";

        saidasCard1.setText("<html><body>" + msg + "</body></html>");
        card1.add(saidasCard1);

        msg = "";
        msg += "<table border='1' style='margin-top: 10px'>";
        msg += "<tr> <td>VETOR 2</td> </tr>";
        for (int i = 0; i < vet2.length; i++) {
            msg += String.format("<tr> <td>Posição %d do vetor 2: %d</td> </tr>", i, vet2[i]);
        }
        msg += "</table>";
        
        saidasCard2.setText("<html><body>" + msg + "</body></html>");
        card2.add(saidasCard2);

        tabbedPane.addTab("Vetor Original", card1);
        tabbedPane.addTab("Vetor Alterado", card2);
        Janela2.add(tabbedPane);
        Janela2.setVisible(true);
    }

    public boolean num2(String nome) 
    {
        String[] nomes = { "Joao", "José", "Alberto", "Luiz", "Alex", "Caio", "Isadora", "Jean", "Elias", "Maria" };  

        for (int i=0; i<nomes.length; i++) {
            if (nomes[i].toLowerCase().equals(nome.toLowerCase())) {
                System.out.printf("%nACHEI");
                System.exit(0);;
            }
        }

        return false;
    }

    public void atvN2() 
    {
        JFrame Janela4 = new JFrame("Atividade 2");

        Janela4.setSize(600,400);
        Janela4.setLocationRelativeTo(null);
        Janela4.setResizable(false);

        JPanel PainelAtv2 = new JPanel();
        
        JTextField nome = new JTextField(30);
        submit = new JButton("Procurar!");

        msg = "TESTE";

        JLabel saidasAtv2 = new JLabel();
        
        PainelAtv2.add(nome);
        PainelAtv2.add(submit);
        PainelAtv2.add(saidasAtv2);
        
        Janela4.add(PainelAtv2);
        //Janela4.pack();
        Janela4.setVisible(true);
    }

    public void atvN3() 
    {
        JFrame Janela3 = new JFrame("Atividade 3");

        Janela3.setSize(600,400);
        Janela3.setLocationRelativeTo(null);
        Janela3.setResizable(false);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel card3 = new JPanel() {
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += 100;
                return size;
            }
        };

        JPanel card4 = new JPanel();

        JLabel saidasCard3 = new JLabel();
        JLabel saidasCard4 = new JLabel();

        msg = "";

        saidasCard3.setText("<html><body>" + msg + "</body></html>");
        card3.add(saidasCard3);

        saidasCard4.setText("<html><body>" + msg + "</body></html>");
        card4.add(saidasCard4);

        tabbedPane.addTab("PAG A", card3);
        tabbedPane.addTab("PAG B", card4);
        Janela3.add(tabbedPane);
        Janela3.setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) 
    {
        //this.ocultaBotoes();

        if (evento.getSource() == N1) {
            this.atvN1();
            saidas.setVisible(true);
        }

        if (evento.getSource() == N2) 
            this.atvN2();

        if (evento.getSource() == N3) 
            this.atvN3();

        if (evento.getSource() == N4) 
            this.atvN3();
    }
}
