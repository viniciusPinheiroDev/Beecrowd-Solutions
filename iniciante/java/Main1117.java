package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1117 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

         int notas = 0;
        double x = 0, media = 0;
        do {
            x = t.nextDouble();
            if (x < 0 || x > 10) {  
                System.out.println("nota invalida");
            } else {
                media += x;
                notas++;
            }

        } while (notas < 2);
        media /= 2;
        System.out.printf("media = %.2f%n", media);
        
        t.close();
    }
}