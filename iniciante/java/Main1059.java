package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1059 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        for (int c = 1; c <= 100; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }
        t.close();
    }
}