package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1118 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        
        double x = 0, media = 0;
        int resp = 0, notas;
       
        while (resp != 2) {
            notas = 0;
            resp = 0;
            media = 0.00;
            while (notas < 2) {
                x = t.nextDouble();
                if (x < 0 || x > 10) {
                    System.out.println("nota invalida");
                } else {
                    media += x;
                    notas++;
                }
            }
            System.out.printf("media = %.2f%n", media / 2);
            while (resp < 1 || resp > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                resp = t.nextInt();
            }
        }
        t.close();
    }
}