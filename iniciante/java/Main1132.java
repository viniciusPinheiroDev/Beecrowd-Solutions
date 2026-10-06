package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1132 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int x = t.nextInt(), y = t.nextInt();
        int somaN = 0;

        if (x > y) {
            for (int c = y; c <= x; c++) {
                if(c % 13 != 0) {
                    somaN += c;
                }
            }
        } else if (y > x) {
            for (int c = x; c <= y; c++) {
                if(c % 13 != 0) {
                    somaN += c;
                }
            }
        }

        System.out.println(somaN);

        t.close();
    }
}