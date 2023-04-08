import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		GridLayoutFrame glf = new GridLayoutFrame();
		glf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		glf.setSize(300,200);
		glf.setVisible(true);

	}

}

class GridLayoutFrame extends JFrame implements ActionListener {

	private JButton[] botoes;
	private static final String[] nomes = {"um", "dois", "três",
	"quatro", "cinco", "seis"};
	private boolean toggle = true;
	private Container container;
	private GridLayout gridLayout1;
	private GridLayout gridLayout2;

	public GridLayoutFrame()
	{
		super("Demo Grid Layout");
		gridLayout1 = new GridLayout(2, 3, 5, 5);	//2 POR 3; LACUNAS DE 5
		gridLayout2 = new GridLayout(3,2);	//3 POR 2; NENHUMA LACUNA
		container = getContentPane();  //OBTÉM O PAINEL DE CONTEÚDO
		setLayout(gridLayout1);
		botoes = new JButton[nomes.length];

		for(int count = 0; count < nomes.length; count++)
		{
			botoes[count] = new JButton(nomes[count]);
			botoes[count].addActionListener(this);	//OUVINTE REGISTRADO
			add(botoes[count]);
		}
	}

	//TRATA EVENTOS DE BOTÃO ALTERNANDO ENTRE LAYOUTS
	public void actionPerformed(ActionEvent event)
	{
		if(toggle)
			container.setLayout(gridLayout2);
		else
			container.setLayout(gridLayout1);

		toggle = !toggle;	//ALTERNA PARA O VALOR OPOSTO
		container.validate();	//REFAZ O LAYOUT DO LAYOUT
	}

}
