import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Inteligencia 
{
    private String[] nomes;
    private String nome;
    public ArrayList<String> possibilidades = new ArrayList<String>();   
    public String baseDeDados = "nomes_brasil.txt";   

    public Inteligencia(String[] vetNomes) 
    {
        this.nomes = vetNomes;
    }

    public Inteligencia(String[] vetNomes, String nomePessoa) 
    {
        this.nomes = vetNomes;
        this.nome = nomePessoa;
    }

    public boolean procuraNome() 
    {
        for (int i=0; i<this.nomes.length; i++) 
            if (this.nomes[i].toLowerCase().equals(this.nome.toLowerCase()))
                return true;

        return false;
    } 
    
    public boolean procuraNome(String nome) 
    {
        this.nome = nome;
        return this.procuraNome();
    }  
    
    public void procurar(String nome)
    {
        if (this.procuraNome(nome) == true)   
            System.out.printf("%nNOME ENCONTRADO ^-^%n%n");  
        else    
            System.out.printf("%nLAMENTO, ESTE NOME NÃO ESTÁ EM NOSSA BASE DE DADOS :<%n%n"); 
    }

    public String procuraPossibilidade()
    {
        String[] n = this.nome.split(""); 
        String possibilidade = ""; 
        int menorTam = 0;
        int contadorFinal = 0;   

        for (int i=0; i<n.length; i++) {
            for (int j=0; j<this.nomes.length; j++) {
                String[] split = this.nomes[j].split("");
                int contador = 0;
                boolean teste = true;

                if (split.length > n.length)
                    menorTam = n.length;
                else
                    menorTam = split.length;

                if (split[0].toLowerCase().equals(n[0].toLowerCase())) {
                    for (int letra=1; letra<menorTam; letra++) {
                        if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) == false) {
                            teste = false;
                        } else if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) && teste == true) {
                            contador++;
                        }
                    }
                }

                if (contador > contadorFinal) {
                    contadorFinal = contador;
                    possibilidade = nomes[j];
                    //possibilidades.add(possibilidade);
                }
            }   
        }

        return possibilidade;
    }

    public void printPossibilidades()
    {
        int i=0;
        System.out.printf("%nO NOME PROCURADO É ALGUM DESTES?: %n");  

        for (i=0; i<possibilidades.size(); i++)
            System.out.printf("%d: %s%n", i+1, possibilidades.get(i));

        System.out.printf("%d: NOME NÃO ESTÁ NA LISTA%n", i+1);
    }

    public String getPossibilidade(int posicao)
    {
        return possibilidades.get(posicao);
    }

    public int getSizePossibilidades()
    {
        return possibilidades.size();
    }

    public void clear() 
    {
        possibilidades.clear();
    }

    public String procuraDicionario() throws IOException
    {
        String linhaTXT = "";
        String[] n = this.nome.split(""); 
        String possibilidade = ""; 
        int menorTam = 0;
        int contadorFinal = 0;   

        FileReader arq = new FileReader(baseDeDados);
        BufferedReader lerArq = new BufferedReader(arq);

        do  {
            linhaTXT = lerArq.readLine();

            for (int i=0; i<n.length; i++) {
                if (linhaTXT == null) {
                    break;
                }
                
                String[] split = linhaTXT.split("");
                
                int contador = 0;
                boolean teste = true;

                if (split.length > n.length)
                    menorTam = n.length;
                else
                    menorTam = split.length;

                for (int letra=0; letra<menorTam; letra++) {
                    if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) == false) {
                        teste = false;
                    } else if (split[letra].toLowerCase().equals(n[letra].toLowerCase()) && teste == true) {
                        contador++;
                    }
                }

                if (contador > contadorFinal) {
                    contadorFinal = contador;
                    possibilidade = linhaTXT;
                    
                } else if (contador == contadorFinal && split[0].toLowerCase().contains(n[0].toLowerCase()) && possibilidades.contains(linhaTXT) == false)
                    possibilidades.add(linhaTXT);
            }

        } while (linhaTXT != null);
   
        arq.close();   

        return possibilidade;
    }

    public boolean nomeExiste(String nome) throws IOException
    {
        String linhaTXT ="";
        boolean achei = false;

        FileReader arq = new FileReader(baseDeDados);
        BufferedReader lerArq = new BufferedReader(arq);
        
        do  {
            linhaTXT = lerArq.readLine();

            if (linhaTXT != null && nome.toLowerCase().equals(linhaTXT.toLowerCase()) == true)
                achei = true;
        } while (linhaTXT != null);

        arq.close();   

        return achei;
    }

}
