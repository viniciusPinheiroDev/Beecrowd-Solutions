package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1010 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int qP1 = t.nextInt();
        double vP1 = t.nextDouble();
        int qP2 = t.nextInt();
        double vP2 = t.nextDouble();

        double vTot = qP1 * vP1 + qP2 * vP2;
        System.out.format("VALOR A PAGAR: R$ %.2f%n", vTot);
        t.close();
    }
 
}