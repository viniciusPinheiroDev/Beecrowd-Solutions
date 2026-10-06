package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1074 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt(), vetx[] = new int[n];

        for (int c = 0; c < n; c++) {
                    vetx[c] = t.nextInt();
                }

        for (int c = 0; c < n; c++) {
            String resp = "";
            if (vetx[c] == 0) {
                System.out.println("NULL");
            } else if (vetx[c] % 2 == 0) {
                resp = "EVEN ";
            } else if (vetx[c] % 2 != 0) {
                resp = "ODD ";
            }

            if (vetx[c] > 0) {
                System.out.println(resp + "POSITIVE");
            } else if (vetx[c] < 0) {
                System.out.println(resp + "NEGATIVE");
            }
            
        }

        t.close();

    }
}