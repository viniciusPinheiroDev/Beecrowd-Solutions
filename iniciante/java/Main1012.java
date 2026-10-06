package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1012 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        double a = t.nextDouble(), b = t.nextDouble(), c = t.nextDouble();
        double pi = 3.14159;
        double aTR =  a * c / 2;
        double aC = pi * Math.pow(c, 2);
        double aT = (a + b) * c / 2;
        double aQ = Math.pow(b, 2);
        double aR = a * b;
        System.out.format("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", aTR, aC, aT, aQ, aR);
        t.close();
    }
 
}