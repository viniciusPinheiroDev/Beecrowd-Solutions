package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1064 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        double val[] = new double[6];
        int valp = 0;
        double somval = 0.0;
        for (int c = 0; c < 6; c++) {
            val[c] = t.nextDouble();
            if (val[c] > 0) {
                valp++;
                somval += val[c];
            }
        }
        somval = somval / valp;
        System.out.printf("%d valores positivos%n%.1f%n", valp, somval);

        t.close();
    }
}