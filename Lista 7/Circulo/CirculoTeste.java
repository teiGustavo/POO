import javax.swing.JOptionPane;

public class CirculoTeste {
    public static void main(String[] args) {

        String mensagem = String.format("Bem vindo(a) ao programa de calculos envolvendo os círculos!");
        JOptionPane.showMessageDialog(null, mensagem);

        Circulo c1 = new Circulo(0.0);

        mensagem = String.format("Valor de pi sendo considerado: %2f", c1.getPi());
        JOptionPane.showMessageDialog(null, mensagem);

        Object[] options = {"Não", "Sim"};
        int opcao = JOptionPane.showOptionDialog(null, "Deseja alterar o valor de pi?", "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (opcao == 1){
            String pi = JOptionPane.showInputDialog("Insira o novo valor de pi");
            Double piAprox = Double.parseDouble(pi);
            c1.setPi(piAprox);

            mensagem = String.format("Novo valor de pi: %.2f", c1.getPi());
            JOptionPane.showMessageDialog(null, mensagem);
        }

        String raio = JOptionPane.showInputDialog("Insira o raio da circunferência");
        Double raioCirculo = Double.parseDouble(raio);
        c1.setRaio(raioCirculo);

        c1.exibeInformacoes();

        Object[] options2 = {"Não", "Sim"};
        int opcao2 = JOptionPane.showOptionDialog(null, "Deseja aumentar o raio?", "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);

        if (opcao2 == 1) {
            String r = JOptionPane.showInputDialog("Insira a porcentagem que deseja acrescentar de tamanho no raio");
            Double percentual = Double.parseDouble(r);
            c1.aumentarRaio(percentual);

            c1.exibeInformacoes();
        }
    }
}
