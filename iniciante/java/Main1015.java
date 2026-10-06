package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1015 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double x1 = t.nextDouble(), y1 =  t.nextDouble(), x2 = t.nextDouble(), y2 = t.nextDouble();
        double d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.format("%.4f%n", d);
        t.close();
    }
 
}