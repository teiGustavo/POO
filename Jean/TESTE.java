import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

class teste{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        double quadrada = 0;
        double cubica = 0;
        int quantidade = 0;

        for (int i=A; i<=B; i++){
            quadrada = Math.sqrt(i);
            cubica = Math.cbrt(i);

            if (quadrada % 1 == 0 && cubica % 1 == 0){
                quantidade++;
            }

        }

        System.out.printf("%d\n", quantidade);

    }
}