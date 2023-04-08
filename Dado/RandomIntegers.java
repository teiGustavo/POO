import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int f5 = 0;
        int f6 = 0;

        SecureRandom randomNumbers = new SecureRandom();

        int qtd = 6000000;

        for (int counter = 1; counter <= qtd; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            switch (face) {
                case 1 :
                f1++;
                break;

                case 2 :
                f2++;
                break;

                case 3 :
                f3++;
                break;

                case 4 :
                f4++;
                break;

                case 5 :
                f5++;
                break;

                case 6 :
                f6++;
                break;
            }
        }

        System.out.printf("Face 1: %d%nFace 2: %d%nFace 3: %d%nFace 4: %d%nFace 5: %d%nFace 6: %d%n", f1, f2, f3, f4, f5, f6);
    }
}
