import java.security.SecureRandom;
import javax.swing.JLabel;

public class Craps {
    //Variaveis
    private int pontuacao = 0;
    private int faceDado1 = 0;
    private int faceDado2 = 0;
    private int somaFaces = 0;
    private int soma = 0;
    private String msg = "";
    private JLabel saidas;

    SecureRandom Dado1 = new SecureRandom();
    SecureRandom Dado2 = new SecureRandom();

    //Construtor
    public Craps(JLabel saidas) {
        this.faceDado1 = 1 + Dado1.nextInt(6);
        this.faceDado2 = 1 + Dado2.nextInt(6);
        this.somaFaces = faceDado1 + faceDado2;

        this.saidas = saidas;
    }

    //Métodos
    public int getFaceDado1() {
        return faceDado1;
    }

    public void setFaceDado1(int faceDado1) {
        this.faceDado1 = faceDado1;
    }

    public int getFaceDado2() {
        return faceDado2;
    }

    public void setFaceDado2(int faceDado2) {
        this.faceDado2 = faceDado2;
    }

    public int getSomaFaces() {
        return somaFaces;
    }

    public void setSomaFaces() {
        this.somaFaces = getFaceDado1() + getFaceDado2();
    }

    public void primeiraRodada() {
       msg += String.format("<br>Numeros sorteados na primeira rodada: %d + %d = %d<br>", this.getFaceDado1(), this.getFaceDado2(), this.getSomaFaces());
    }

    public void mensagemDerrota() {
        msg += String.format("O jogador perdeu!<br>");
    }

    public void mensagemVitoria() {
        msg += String.format("O jogador venceu!<br>");
    }

    public void sorteiaDados() {
        faceDado1 = 1 + Dado1.nextInt(6);
        faceDado2 = 1 + Dado2.nextInt(6);

        this.setFaceDado1(faceDado1);
        this.setFaceDado2(faceDado2);
        this.setSomaFaces();
    }

    public void novaRodada() {
        pontuacao = this.getSomaFaces();
        msg += String.format("Sua pontuacao: %d<br>", pontuacao);

            do {
                this.sorteiaDados();

                soma = this.getSomaFaces();
                msg += String.format("Numeros sorteados: %d + %d = %d<br>", this.getFaceDado1(), this.getFaceDado2(), this.getSomaFaces());

                if (soma == 7) {
                    mensagemDerrota();
                    break;
                } else if (soma == pontuacao) {
                    mensagemVitoria();
                }
            } while (soma != pontuacao);
    }

    public void iniciarJogo() {
        this.primeiraRodada();

        switch (this.getSomaFaces()) {
            case 2 :
            this.mensagemDerrota();
            break;

            case 3 :
            this.mensagemDerrota();
            break;

            case 4 :
            this.novaRodada();
            break;

            case 5 :
            this.novaRodada();
            break;

            case 6 :
            this.novaRodada();
            break;

            case 7 :
            this.mensagemVitoria();
            break;

            case 8 :
            this.novaRodada();
            break;

            case 9 :
            this.novaRodada();
            break;

            case 10 :
            this.novaRodada();
            break;

            case 11 :
            this.mensagemVitoria();
            break;

            case 12 :
            this.mensagemDerrota();
            break;
        }

        saidas.setText("<html>" + msg + "</html>");
    }
}