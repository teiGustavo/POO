import javax.swing.JOptionPane;

public class Alunos {
    //Atributos
    private String matricula;
    private String nome;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaProva3;
    private Double notaTrabalho;
    int pesoP = 2;
    int pesoT = 4;

    //Construtor Alunos
    public Alunos(String matriculaAluno, String nomeAluno, Double notaProva1Aluno, Double notaProva2Aluno, Double notaProva3Aluno, Double notaTrabalhoAluno) {
        this.matricula = matriculaAluno;
        this.nome = nomeAluno;
        this.notaProva1 = notaProva1Aluno;
        this.notaProva2 = notaProva2Aluno;
        this.notaProva3 = notaProva3Aluno;
        this.notaTrabalho = notaTrabalhoAluno;
    }

    //Métodos
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaProva1() {
        return this.notaProva1;
    }

    public void setNotaProva1(Double notaProva1Aluno) {
        if (notaProva1Aluno >= 0.0 && notaProva1Aluno <= 10.0){
            this.notaProva1 = notaProva1Aluno;
        } else {
            String mensagem = String.format("Nota não está entre 0 e 10 pts!");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public Double getNotaProva2() {
        return this.notaProva2;
    }

    public void setNotaProva2(Double notaProva2Aluno) {
        if (notaProva2Aluno >= 0.0 && notaProva2Aluno <= 10.0){
            this.notaProva2 = notaProva2Aluno;
        } else {
            String mensagem = String.format("Nota não está entre 0 e 10 pts!");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public Double getNotaProva3() {
        return this.notaProva3;
    }

    public void setNotaProva3(Double notaProva3Aluno) {
        if (notaProva3Aluno >= 0.0 && notaProva3Aluno <= 10.0){
            this.notaProva3 = notaProva3Aluno;
        } else {
            String mensagem = String.format("Nota não está entre 0 e 10 pts!");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public Double getNotaTrabalho() {
        return this.notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalhoAluno) {
        if (notaTrabalhoAluno >= 0.0 && notaTrabalhoAluno <= 10.0){
            this.notaTrabalho = notaTrabalhoAluno;
        } else {
            String mensagem = String.format("Nota não está entre 0 e 10 pts!");
            JOptionPane.showMessageDialog(null, mensagem);
        } 
    }

    public boolean validaNota(Double nota){
        if (nota < 0.0 || nota > 10.0){
            return false;
        } else {
            return true;
        }
    }

    public Double media() {
        Double mediaFinal = 0.0;

        mediaFinal = ((getNotaProva1() * pesoP) + (getNotaProva2() * pesoP) + (getNotaProva3() * pesoP) + (getNotaTrabalho() * pesoT)) / ((pesoP * 3) + pesoT);

        return mediaFinal;
    }

    public Double Final() {
        Double pFinal = 0.0;
        pFinal = 4.0 - this.media();
        return pFinal;
    }

    public Double notaNecessariaFinal() {
        Double nFinal = 0.0;

        if (this.media() >= 4.0 && this.media() < 6.0){
            nFinal = ((10 - this.media()) + 2);

            return nFinal;
        } else {
            return nFinal;
        }
    }

    public void nFinal() {
        if (this.media() <= 4.0){
            String mensagem = String.format("A média do aluno %s (matrícula %s) é: %.2f%nO aluno não poderá realizar a recuperação final pois é necessário %.2f pontos para alcançar 4.0", this.getNome(), this.getMatricula(), this.media(), this.Final());
            JOptionPane.showMessageDialog(null, mensagem);
        } else if (this.media() >= 4.0 && this.media() < 6.0) {
            String mensagem = String.format("A média do aluno %s (matrícula %s) é: %.2f%nPrecisa de alcançar: %.2f pontos na prova final para ser aprovado!", this.getNome(), this.getMatricula(), this.media(), this.notaNecessariaFinal());
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            String mensagem = String.format("A média do aluno %s (matrícula %s) é: %.2f%nNão precisa realizar a prova final!", this.getNome(), this.getMatricula(), this.media());
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

}

