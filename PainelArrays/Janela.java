import javax.swing.JFrame;

public class Janela extends JFrame{

    public void janela() {
        JFrame Janela2  = new JFrame("Craps");
        
        Janela2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Janela2.setSize(600,400);
        Janela2.setLocationRelativeTo(null);
    }

}
