import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Paciente {

    //Atributos
    private String nome;
    private String sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;
    private int peso;

    //Construtor
    public Paciente(String nomePessoa, String sexoPessoa, int diaNascimentoPessoa, int mesNascimentoPessoa, int anoNascimentoPessoa, double alturaPessoa, int pesoPessoa) {
        this.nome = nomePessoa;
        this.sexo = sexoPessoa;
        this.diaNascimento = diaNascimentoPessoa;
        this.mesNascimento = mesNascimentoPessoa;
        this.anoNascimento = anoNascimentoPessoa;
        this.altura = alturaPessoa;
        this.peso = pesoPessoa;
    }

    public void exibeInformacoes() {
        String mensagem = String.format("Informações do paciente %n%n Nome %s %n Sexo: %s %n Dia do Nascimento: %d %n Mês do Nascimento: %d %n Ano do Nascimento: %d %n Idade: %d %n Altura(em m): %.2f %n Peso(em kg): %d %n", this.nome, this.sexo, this.diaNascimento, this.mesNascimento, this.anoNascimento, nascimentoAnos(), this.altura, this.peso);
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void setNome(String nomePessoa) {
        this.nome = nomePessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSexo(String sexoPessoa) {
        this.sexo = sexoPessoa;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setDiaNascimento(int diaNascimentoPessoa) {
        this.diaNascimento = diaNascimentoPessoa;
    }

    public int getDiaNascimento() {
        return this.diaNascimento;
    }

    public void setMesNascimento(int mesNascimentoPessoa) {
        this.mesNascimento = mesNascimentoPessoa;
    }

    public int getMesNascimento() {
        return this.mesNascimento;
    }

    public void setAnoNascimento(int anoNascimentoPessoa) {
        this.anoNascimento = anoNascimentoPessoa;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setNascimento(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano) == true) {
            String mensagem = String.format("Alterado com sucesso!");
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            String mensagem = String.format("Data de nascimento incorreta!");
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public boolean validaData(int dia, int mes, int ano) {
        int anoNasc = ano;
        int mesNasc = mes;
        int diaNasc = dia;
        LocalDate localDate = LocalDate.now().withYear(anoNasc).withMonth(mesNasc).with(TemporalAdjusters.lastDayOfMonth());

        if (mesNasc <= localDate.getMonthValue() && diaNasc <= localDate.getDayOfMonth()) {
            return true;
        } else {
           return false;
        }
    }
    
    public void setAltura(double alturaPessoa) {
        this.altura = alturaPessoa;
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean validaAltura(double alturaPessoa) {
        if (alturaPessoa < 2.6 && alturaPessoa > 0.40){
            return true;
        } else {
            return false;
        }
    }

    public void setPeso(int pesoPessoa) {
        this.peso = pesoPessoa;
    }

    public int getPeso() {
        return this.peso;
    }

    public boolean validaPeso(double pesoPessoa) {
        if (pesoPessoa > 3.0 && pesoPessoa < 600.0){
            return true;
        } else {
            return false;
        }
    }

    public int nascimentoAnos() {
        LocalDate localDate = LocalDate.now();
        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int ano = localDate.getYear();

        if (this.mesNascimento <= mes && this.diaNascimento <= dia) {
            int idadeAnos = ano - this.anoNascimento;
            return idadeAnos;
        } else {
            int idadeAnos = (ano - this.anoNascimento) - 1;
            return idadeAnos;
        }
    }

    public int frequenciaMax() {
        int idade = this.nascimentoAnos(); 
        int freqMax = 220 - idade;
        return freqMax;
    }

    public void frequenciaAlvo() {
        int freqMax = this.frequenciaMax(); 
        int freqAlvoMin = (freqMax / 100) * 50;
        int freqAlvoMax = (freqMax / 100) * 85;
        
        String mensagem = String.format("A frequência cardíaca alvo está entre: %d e %d", freqAlvoMin, freqAlvoMax);
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public double IMC() {
        double imcPessoa = this.altura * this.altura;
        double imc =  this.peso / imcPessoa;
        return imc;
    }

    public void tabelaIMC() {
        double seuImc = this.IMC();
        String resultImc = "indefinido";

        if (seuImc < 18.5){
            resultImc = "Abaixo do peso";
        } else
        if (seuImc >= 18.5 && seuImc < 25.0){
            resultImc = "Peso normal";
        } else
        if (seuImc >= 25.0 && seuImc < 30.0){
            resultImc = "Acima do peso";
        } else
        if (seuImc >= 30.0 && seuImc < 35.0){
            resultImc = "Obesidade classe I";
        } else
        if (seuImc >= 35.0 && seuImc < 40.0){
            resultImc = "Obesidade classe II";
        } else {
            resultImc = "Obesidade classe III";
        }
        String mensagem = String.format("Tabela IMC: %n%nSeu IMC é: %s%n%nMenor que 18,5 = Abaixo do peso normal%nEntre 18,5 e 24,9 = Peso normal%nEntre 25,0 e 29,9 = Acima do peso%nEntre 30,0 e 34,9 = Obesidade classe I%nEntre 35,0 e 39,9 = Obesidade classe II%nMaior ou igual a 40,0 = Obesidade classe III", resultImc);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
