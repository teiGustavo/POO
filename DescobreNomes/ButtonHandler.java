import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonHandler implements ActionListener 
{
    private JPanel painel;
    private String msg = "";
    private JButton procurar;
    private JLabel saidas;

    public ButtonHandler(JPanel Painel, JButton botaoProcurar, JLabel saidasPrograma) 
    {
        this.painel = Painel;
        this.procurar = botaoProcurar;
        this.saidas = saidasPrograma;
    }

    public void actionPerformed(ActionEvent evento) 
    {
        //this.ocultaBotoes();

        if (evento.getSource() == procurar);
            
        

    }
}
