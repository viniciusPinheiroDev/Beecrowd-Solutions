package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1011 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int r = t.nextInt();
        double pi = 3.14159;
        double ar = 4.0/3 * pi * (Math.pow(r, 3));
        System.out.format("VOLUME = %.3f%n", ar);
        t.close();
    }
 
}