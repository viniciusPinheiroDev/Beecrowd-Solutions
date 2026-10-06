package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1014 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int dP = t.nextInt();
        double cG = t.nextDouble();
        double kmL = dP / cG;
        System.out.format("%.3f km/l%n", kmL);
        t.close();
    }
 
}