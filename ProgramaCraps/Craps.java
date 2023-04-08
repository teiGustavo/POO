import java.security.SecureRandom;
import javax.swing.JLabel;

public class Craps {
    //Variaveis
    private int pontuacao = 0;
    private int faceDado1 = 0;
    private int faceDado2 = 0;
    private int somaFaces = 0;
    private int soma = 0;
    private int qtd = 100000;
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

    public void relatorio() {
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0;
        int fd1 = 0, fd2 = 0, fd3 = 0, fd4 = 0, fd5 = 0, fd6 = 0;

        for (int i=0; i<= qtd; i++) {
            this.sorteiaDados();

            if (this.getFaceDado1() == 1) {
                f1++;
            } else if (this.getFaceDado1() == 2) {
                f2++;
            } else if (this.getFaceDado1() == 3) {
                f3++;
            } else if (this.getFaceDado1() == 4) {
                f4++;
            } else if (this.getFaceDado1() == 5) {
                f5++;
            } else if (this.getFaceDado1() == 6) {
                f6++;
            } 

            if (this.getFaceDado2() == 1) {
                fd1++;
            } else if (this.getFaceDado2() == 2) {
                fd2++;
            } else if (this.getFaceDado2() == 3) {
                fd3++;
            } else if (this.getFaceDado2() == 4) {
                fd4++;
            } else if (this.getFaceDado2() == 5) {
                fd5++;
            } else if (this.getFaceDado2() == 6) {
                fd6++;
            } 
        }

        System.out.printf("%nRelatorio: %nVezes sorteadas: %d%n%nFace n1(Dado1): %d%nFace n2(Dado1): %d%nFace n3(Dado1): %d%nFace n4(Dado1): %d%nFace n5(Dado1): %d%nFace n6(Dado1): %d%n%nFace n1(Dado2): %d%nFace n2(Dado2): %d%nFace n3(Dado2): %d%nFace n4(Dado2): %d%nFace n5(Dado2): %d%nFace n6(Dado2): %d", qtd, f1, f2, f3, f4, f5, f6, fd1, fd2, fd3, fd4, fd5, fd6);
    }
}