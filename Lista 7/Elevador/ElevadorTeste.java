import javax.swing.JOptionPane;

public class ElevadorTeste {
    public static void main(String[] args) {  
        int opcao = 0;

        Elevador e = new Elevador(10, 20);
        
        do {
            String mensagem = String.format("Andar atual: %d%nQuantidade de pessoas: %d%n", e.getAndarAtual(), e.getPessoas());
            Object[] options = {"Subir", "Descer", "Entrar", "Sair", "Exit"};
            opcao = JOptionPane.showOptionDialog(null, mensagem, "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (opcao) {
                case 0:
                e.sobe(1);
                break;

                case 1:
                e.desce(1);
                break;

                case 2:
                e.entra(1);
                break;

                case 3:
                e.sai(1);
                break;
            }
        } while (opcao != 4);

    }
}
