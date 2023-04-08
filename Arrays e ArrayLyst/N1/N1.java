public class N1 
{
    public static void main(String[] args) 
    {
        int vetor1[] = new int [10]; 
        int vetor2[] = new int [10];    

        int j = 9;
        System.out.printf("%nImprimindo o vetor 1: %n%n");
        for (int i=0; i<vetor1.length; i++) {
            vetor1[i] = i+1;
            System.out.printf("Posição %d do vetor 1: %d%n", i, vetor1[i]);
            vetor2[j] = vetor1[i];
            j--;
        }
        
        System.out.printf("%nImprimindo o vetor 2: %n%n");
        for (int i=0; i<vetor2.length; i++) {
            System.out.printf("Posição %d do vetor 2: %d%n", i, vetor2[i]);
        }
    }
}