package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1116 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        int x = 0, y = 0;

        for (int c = 0; c < n; c++) {
            x = t.nextInt();
            y = t.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) x / y;
                System.out.println(divisao);
            }
        }
        
        t.close();
    }
}