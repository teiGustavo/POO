import javax.swing.JOptionPane;
import javax.swing.Painter;

public class CadastroPaciente {
    public static void main(String[] args) {
        String mensagem = String.format("Bem vindo(a) ao programa de cadastro! %nPor favor, insira os dados do paciente");
        JOptionPane.showMessageDialog(null, mensagem);

        Paciente paciente1 = new Paciente("", "", 0, 0, 0, 0, 0);
        
        String nomePessoa = JOptionPane.showInputDialog("Qual é o nome do Paciente?");
        paciente1.setNome(nomePessoa);
        
        Object[] options = { "Masculino", "Feminino"};
        int opcao = JOptionPane.showOptionDialog(null, "Selecione o sexo:", "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        String sexoPessoa = "indefinido";
        if (opcao == 0){
            sexoPessoa = "Masculino";
            paciente1.setSexo(sexoPessoa);
        } else if (opcao == 1) {
            sexoPessoa = "Feminino";
            paciente1.setSexo(sexoPessoa);
        }
        
        boolean verificacao = false;
        while (verificacao == false){
            String diaN = JOptionPane.showInputDialog("Dia do nascimento");
            int dia = Integer.parseInt(diaN);

            String mesN = JOptionPane.showInputDialog("Mês do nascimento");
            int mes = Integer.parseInt(mesN);

            String anoN = JOptionPane.showInputDialog("Ano do nascimento");
            int ano = Integer.parseInt(anoN);
            
            if (paciente1.validaData(dia, mes, ano) == true){
                verificacao = true;

                paciente1.setDiaNascimento(dia);
                paciente1.setMesNascimento(mes);
                paciente1.setAnoNascimento(ano);
            } else {
                verificacao = false;
                mensagem = String.format("Data de nascimento inválida!");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

        verificacao = false;
        while (verificacao == false){
            String altura = JOptionPane.showInputDialog("Altura em metros");
            double alturaPessoa = Double.parseDouble(altura);

            if (paciente1.validaAltura(alturaPessoa) == true){
                verificacao = true;
                paciente1.setAltura(alturaPessoa);
            } else {
                verificacao = false;
                mensagem = String.format("Altura inválida!");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

        verificacao = false;
        while (verificacao == false){
            String peso = JOptionPane.showInputDialog("Peso em quilogramas");
            int pesoPessoa = Integer.parseInt(peso);

            if (paciente1.validaPeso(pesoPessoa) == true){
                verificacao = true;
                paciente1.setPeso(pesoPessoa);
            } else {
                verificacao = false;
                mensagem = String.format("Peso inválido!");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

        paciente1.exibeInformacoes();
        
        mensagem = String.format("A frequência máxima é: %d", paciente1.frequenciaMax());
        JOptionPane.showMessageDialog(null, mensagem);
        
        paciente1.frequenciaAlvo();

        mensagem = String.format("O IMC é %.2f", paciente1.IMC());
        JOptionPane.showMessageDialog(null, mensagem);

        paciente1.tabelaIMC();
    }
}
