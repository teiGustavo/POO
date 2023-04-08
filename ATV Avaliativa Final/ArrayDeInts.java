import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeInts 
{
    //Atributos
    private int array[] = new int[10];
    public int intervaloRandom = 50; //Sequência de 1 a 50

    //Métodos
    public int[] getArray() 
    {
        return array;
    }

    public void setArray(int[] array) 
    {
        this.array = array;
    }

    public void limpaArray() 
    {
        int vetor[] = new int[10];
        this.array = vetor;
    }

    public ArrayDeInts() 
    {
        SecureRandom num = new SecureRandom();
        for (int i=0; i<array.length; i++) 
            array[i] = num.nextInt(intervaloRandom) + 1;
    }

    public void imprime()
    {
        int[] arr = this.getArray();
        System.out.printf("%nIMPRIMINDO O VETOR: %n");
        for (int i=0; i<arr.length; i++)
            System.out.printf("%dª posição [%d]: %d%n", i+1, i, arr[i]);
    }

    public void leia()
    {
        Scanner e = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            System.out.printf("%nInsira o %dº número!%n", i+1);
            array[i] = e.nextInt();
        }
        e.close();
    }

    public boolean ehIgual(int[] vetor)
    {
        boolean bool = true;
        int vet1[] = array;
        int vet2[] = vetor;
        Arrays.sort(vet1);
        Arrays.sort(vet2);

        for (int i=0; i<vet2.length; i++)
            if (vet1[i] != vet2[i])
                bool = false;

        if (vet1.length != vet2.length)
            bool = false;

        return bool;
    }

    public void soma(int valor)
    {
        for (int i=0; i<array.length; i++)
            array[i] += valor;
    }

    public int total()
    {
        int soma = 0;
        for (int i=0; i<array.length; i++)
            soma += array[i];
        return soma;
    }

    public int total(int vetor[])
    {
        int soma = 0;
        for (int i=0; i<vetor.length; i++)
            soma += vetor[i];
        return soma;
    }

    public boolean existe(int numero)
    {
        for (int i=0; i<array.length; i++) 
            if (array[i] == numero) {
                return true;
            }
        return false;
    }

    public void leiaUnico()
    {
        Scanner e = new Scanner(System.in);

        System.out.printf("%nLimpar vetor antes de inserir os valores?(S/N)%n");
        String op = e.nextLine().toUpperCase();

        if (op.equals("S") || op.equals("SIM")) {
            this.limpaArray();
            System.out.printf("%nO vetor foi limpo com sucesso!%n");
        }

        for (int i=0; i<array.length; i++) {
            System.out.printf("%nInsira o %dº número!%n", i+1);
            int num = e.nextInt();
            boolean existe = true;

            if (this.existe(num) == false) {
                array[i] = num;
                existe = false;
            } else {
                do {
                    System.out.printf("%nNúmero inválido ou já existente!");
                    System.out.printf("%nInsira o %dº número novamente!%n", i+1);
                    num = e.nextInt();
                    if (this.existe(num) == false) {
                        array[i] = num;
                        existe = false;
                    }
                } while (existe != false);
            }
        }
        e.close();
    }

    public double media() 
    {
        double media = this.total();
        media /= array.length;
        return media;
    }

    public int maior()
    {
        int maior = array[0];
        for (int i=0; i<array.length; i++)
            if (maior < array[i])
                maior = array[i];
        return maior;
    }

    public int menor()
    {
        int menor = array[0];
        for (int i=0; i<array.length; i++)
            if (menor > array[i])
                menor = array[i];
        return menor;
    }

    public void somaArray(int[] vetor)
    {
        if (array.length == vetor.length)
            for (int i=0; i<array.length; i++)
                array[i] += vetor[i];
    }

    public void troca(int posicao1, int posicao2)
    {
        int aux = array[posicao1];
        array[posicao1] = array[posicao2];
        array[posicao2] = aux;
    }

    public int maisProximo(int numero)
    {
        int distancia = 0;
        int menorDistancia = Math.abs(numero - array[0]);
        int maisProx = array[0];
        for (int i=0; i<array.length; i++) {
            distancia = Math.abs(numero - array[i]);
            if (menorDistancia > distancia) {
                menorDistancia = distancia;
                maisProx = array[i];
            }
        }
        return maisProx;
    }

    public void inverte()
    {
        int aux[] = new int[array.length];
        for (int i=0; i<array.length; i++)
            aux[i] = array[9-i];
        this.setArray(aux);
    }

    public boolean ehPalindromo()
    {
        boolean bool = true;
        for (int i=0; i<(array.length/2); i++)
            if (array[i] != array[9-i])
                bool = false;
        return bool;
    }

    public boolean ehCrescente()
    {
        boolean bool = true;
        for (int i=0; i<(array.length-1); i++)
            if (array[i] > array[i+1]) {
                bool = false;
                break;
            }
        return bool;
    }

    public int produtoEscalar(int[] vetor)
    {
        int aux[] = new int[array.length];
        for (int i=0; i<array.length; i++)
            aux[i] = (array[i] * vetor[i]);
        return this.total(aux);
    }

    public boolean existeQualquer(int[] vetor)
    {
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length; j++)
                if (array[i] == vetor[j])
                    return true;
        return false;
    }

    public boolean existemTodos(int[] vetor)
    {
        int count = 0;
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length; j++)
                if (array[i] == vetor[j])
                    count++;
        if (count == array.length)
            return true;
        else
            return false;
    }

    public double distanciaEuclidiana(int[] vetor)
    {
        int aux[] = new int[array.length];
        for (int i=0; i<array.length; i++) {
            int diferenca = array[i] - vetor[i];
            int quadrado = diferenca * diferenca;
            aux[i] = quadrado;
        }
        int soma = this.total(aux);
        double raiz = Math.sqrt(soma);
        return raiz;
    }
}