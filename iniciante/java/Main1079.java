package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1079 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        double notas[][] = new double[n][3];
        double media[] = new double[n];
        
        for (int c = 0; c < n; c++) {
            for (int d = 0; d < 3; d++) {
                notas[c][d] = t.nextDouble();
            }
            media[c] = ((notas[c][0] * 2) + (notas[c][1] * 3) + (notas[c][2] * 5)) / 10;
        }

        for (int c = 0; c < n; c++) {
            System.out.printf("%.1f%n", media[c]);
        }
        t.close();
    }
}