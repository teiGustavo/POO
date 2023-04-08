import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonHandler implements ActionListener {
    private JPanel painel;
    private JButton comecar;
    private JLabel saidas;

    public ButtonHandler(JPanel Painel, JButton botaoComecar, JLabel saidasJogo){
        this.painel = Painel;
        this.comecar = botaoComecar;
        this.saidas = saidasJogo;
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == comecar) {
            comecar.setVisible(false);
            saidas.setVisible(true);

            Craps Craps = new Craps(saidas);
            
            Craps.iniciarJogo();
        }
    }
}
