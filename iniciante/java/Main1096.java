package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1096 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        for (int i = 1; i <= 9; i++) {
            int j = 7;
            if (i % 2 == 1) {
                for (int c = 1; c <= 3; c++) {
                    System.out.printf("I=%d J=%d%n", i, j--);
                }
            }
        }
        t.close();
    }
}