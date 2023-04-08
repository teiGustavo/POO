import javax.swing.JOptionPane;

public class AlunosTeste {
    public static void main(String[] args) {
        
        String mensagem = String.format("Bem vindo(a) ao programa de calculo de médias!");
        JOptionPane.showMessageDialog(null, mensagem);

            String qtdA = JOptionPane.showInputDialog("Insira a quantidade de alunos que deseja cadastrar:");
            int qtdAlunos = Integer.parseInt(qtdA);

            Alunos [] alunos = new Alunos[qtdAlunos];

            for (int i=0; i<qtdAlunos; i++){
                alunos[i] = new Alunos("", "", 0.0, 0.0, 0.0, 0.0);

                mensagem = String.format("Matrícula do aluno %d:", i+1);
                String matricula = JOptionPane.showInputDialog(mensagem);
                alunos[i].setMatricula(matricula);

                
                mensagem = String.format("Nome do aluno %d:", i+1);
                String nome = JOptionPane.showInputDialog(mensagem);
                alunos[i].setNome(nome);

                boolean verificacao = false;
                while (verificacao == false) {
                    mensagem = String.format("Insira a nota da 1ª prova do aluno %s:", alunos[i].getNome());
                    String notaP1 = JOptionPane.showInputDialog(mensagem);
                    Double notaProva1Aluno = Double.parseDouble(notaP1);
                    alunos[i].setNotaProva1(notaProva1Aluno);
                    
                    if (alunos[i].validaNota(notaProva1Aluno) == true){
                        verificacao = true;
                    }
                }

                verificacao = false;
                while (verificacao == false) {
                    mensagem = String.format("Insira a nota da 2ª prova do aluno %s:", alunos[i].getNome());
                    String notaP2 = JOptionPane.showInputDialog(mensagem);
                    Double notaProva2Aluno = Double.parseDouble(notaP2);
                    alunos[i].setNotaProva2(notaProva2Aluno);

                    if (alunos[i].validaNota(notaProva2Aluno) == true){
                        verificacao = true;
                    }
                }

                verificacao = false;
                while (verificacao == false) {
                    mensagem = String.format("Insira a nota da 3ª prova do aluno %s:", alunos[i].getNome());
                    String notaP3 = JOptionPane.showInputDialog(mensagem);
                    Double notaProva3Aluno = Double.parseDouble(notaP3);
                    alunos[i].setNotaProva3(notaProva3Aluno);

                    if (alunos[i].validaNota(notaProva3Aluno) == true){
                        verificacao = true;
                    }
                }

                verificacao = false;
                while (verificacao == false) {
                    mensagem = String.format("Insira a nota do trabalho do aluno %s:", alunos[i].getNome());
                    String notaT = JOptionPane.showInputDialog(mensagem);
                    Double notaTrabalhoAluno = Double.parseDouble(notaT);
                    alunos[i].setNotaTrabalho(notaTrabalhoAluno);

                    if (alunos[i].validaNota(notaTrabalhoAluno) == true){
                        verificacao = true;
                    }
                }
            }

            mensagem = String.format("Exibir usuarios cadastrados?");
            Object[] options = {"Sim", "Não"};
            int opcao = JOptionPane.showOptionDialog(null, mensagem, "Mensagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (opcao == 0){
                for (int i=0; i<alunos.length; i++){
                    mensagem = String.format("Aluno: %s%nMatrícula: %s%nNota da prova 1: %.2f%nNota da prova 2: %.2f%nNota da prova 3: %.2f%nNota do trabalho: %.2f", alunos[i].getNome(), alunos[i].getMatricula(), alunos[i].getNotaProva1(), alunos[i].getNotaProva2(), alunos[i].getNotaProva3(), alunos[i].getNotaTrabalho());
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            }

            for (int i=0; i<alunos.length; i++) {
                alunos[i].nFinal();
            }

    }
}
