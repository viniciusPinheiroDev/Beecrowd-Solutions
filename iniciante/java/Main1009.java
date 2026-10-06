package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        double sF = t.nextDouble(), vE = t.nextDouble();
        double tot = (vE * 0.15) + sF;
        System.out.format("TOTAL = R$ %.2f%n", tot); 
        t.close();
    }
 
}