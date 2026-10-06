package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1066 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int val[] = new int[5];
        int valp = 0, vali = 0, valpo = 0, valn = 0;

        for (int c = 0; c < 5; c++) {
            val[c] = t.nextInt();
            if (val[c] % 2 == 0) {
                valp++;
            } else {
                vali++;
            } if (val[c] > 0) {
                valpo++;
            } else if (val[c] < 0) {
                valn++;
            }
        }
        System.out.printf("%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)%n", valp, vali, valpo, valn);
        

        t.close();
    }
}