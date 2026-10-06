package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1036 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double a = t.nextDouble(), b = t.nextDouble(), c = t.nextDouble(), delta = 0.0, bhask1 = 0.0, bhask2 = 0.0;
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0 || delta < 0 ) {
            System.out.println("Impossivel calcular");
        } else {
            bhask1 = (-b + Math.sqrt(delta)) / (2 * a);
            bhask2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n",  bhask1, bhask2);
        }
        t.close();
    }
}