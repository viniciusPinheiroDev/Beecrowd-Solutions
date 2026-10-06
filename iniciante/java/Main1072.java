package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1072 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);
        int n = t.nextInt();
        int val, in = 0, out = 0;
        for (int c = 1; c <= n; c++) {
            val = t.nextInt();
            if (val >= 10 && val <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in%n%d out%n", in, out);

        t.close();
    }
}