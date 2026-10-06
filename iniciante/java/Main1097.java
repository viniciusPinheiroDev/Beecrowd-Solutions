package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1097 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int j = 7;

        for (int i = 1; i <= 9; i += 2) {
            for (int c = 1; c <= 3; c++) {
                System.out.printf("I=%d J=%d%n", i, j);
                j--;
            }
            j += 5;
        }
        t.close();
    }
}