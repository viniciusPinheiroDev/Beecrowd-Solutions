package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1073 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt(), qn = 1;

        for (int c = 1; c <= n; c++) {
            if (c % 2 == 0) {
                qn = (int) Math.pow(c, 2);
                System.out.printf("%d^2 = %d%n", c, qn);
            }
        }
        t.close();

    }
}