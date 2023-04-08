import javax.swing.JFrame;

public class Janela extends JFrame{

    public void janela() {
        JFrame Janela = new JFrame("Craps");

        Janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Janela.setSize(600,400);
        Janela.setLocationRelativeTo(null);
    }

}
