package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1098 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int I = 0, J = 0;
        double i = 0.0, j = 0.0;
        for (int c1 = 0; c1 <= 20; c1 += 2) {
            i = c1 / 10.0;
            if (i % 1 == 0) {
                I = (int) i;
                for (int c2 = 1; c2 <= 3; c2++) {
                    J = c2 + I;
                    System.out.printf("I=%d J=%d%n", I, J);
                }
            } else {
                for (int c2 = 1; c2 <= 3; c2++) {
                    j = (c2 * 10 / 10.0) + i;
                    System.out.printf("I=%.1f J=%.1f%n", i, j);
                }
            }
        }
        
        t.close();
    }
}