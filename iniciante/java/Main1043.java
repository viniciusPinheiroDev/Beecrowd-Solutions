package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1043 {

    public static double per(double x, double y, double z) {
        return x + y + z;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double a = t.nextDouble(), b = t.nextDouble(), c = t.nextDouble(), per = 0, aTra = 0;
        
        if (a < (b + c) && b < (a + c) && c < (b + a) ) {
            per = per(a, b, c);
        } else {
            aTra = ((a + b) * c) / 2; 
        }
        if (per != 0 && aTra == 0) {
            System.out.printf("Perimetro = %.1f%n", per);
        } else {
            System.out.printf("Area = %.1f%n", aTra);
        }

        
        t.close();
    }
}