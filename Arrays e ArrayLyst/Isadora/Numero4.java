public class Numero4 
{
    public static void main(String[] args) 
    {
        int[] vetor1 = { 1, 20, 3, 5, 5, 6, 78, 8, 9, 9};    
        int[] vetor2 = { 1, 20, 3, 5, 5, 6, 7, 81, 9, 10};   
        int[] inter = new int[vetor1.length];  
        
        for (int i=0; i<vetor1.length-1; i++) {
            if (vetor1[i] == vetor1[i+1])
                vetor1[i] = -1;
            if(vetor2[i] == vetor2[i+1])
                vetor2[i] = -2;
        }

        int p = 0;
        System.out.printf("%nINTERSEÇÃO: %n%n");
        for (int i=0; i<vetor1.length; i++){
            for (int j=0; j<vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]){
                    for (int k=0; k<=inter.length; k++) {
                        if (k < inter.length && vetor1[i] != inter[k] && vetor1[i] == vetor1[k]) {
                            inter[p] = vetor1[i];
                            System.out.printf("%d%n", inter[p]);
                            p++;
                        }     
                    }
                }
            }
        }
    }    
}