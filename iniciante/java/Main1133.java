package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1133 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int x = t.nextInt(), y = t.nextInt();

        if (x > y) {
            for (int c = y + 1; c < x; c++) {
                if(c % 5 == 2 || c % 5 == 3) {
                    System.out.println(c);
                }
            }
        } else if (x < y) {
            for (int c = x + 1; c < y; c++) {
                if(c % 5 == 2 || c % 5 == 3) {
                    System.out.println(c);
                }
            }
        }

        t.close();
    }
}