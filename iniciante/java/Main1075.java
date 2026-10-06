package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1075 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        for (int c = 1; c <= 10000; c++) {
            if (c % n == 2) {
                System.out.println(c);
            }
        }

        t.close();

    }
}