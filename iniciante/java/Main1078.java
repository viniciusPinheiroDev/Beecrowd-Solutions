package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1078 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt(), mult;

        for (int c = 1; c <= 10; c++) {
            mult = c * n;
            System.out.printf("%d x %d = %d%n", c, n, mult);
        }


        t.close();

    }
}