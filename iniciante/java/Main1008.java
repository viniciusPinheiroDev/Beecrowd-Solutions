package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1008 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int nF = t.nextInt(), hT = t.nextInt();
        double s = t.nextDouble();
        double sH = s * hT;
        System.out.format("NUMBER = %d%nSALARY = U$ %.2f%n", nF, sH);
        t.close();
    }
 
}