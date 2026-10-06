package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1065 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int val[] = new int[5];
        int valp = 0;

        for (int c = 0; c < 5; c++) {
            val[c] = t.nextInt();
            if (val[c] % 2 == 0) {
                valp++;
            }
        }
        System.out.println(valp + " valores pares");

        t.close();
    }
}