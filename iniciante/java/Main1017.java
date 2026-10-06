package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1017 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int tG = t.nextInt(), vM = t.nextInt();
        int dP = vM * tG;
        double lN = dP / 12.0;
        System.out.format("%.3f%n", lN);
        t.close();
    }
 
}