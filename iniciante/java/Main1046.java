package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1046 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int hi = t.nextInt(), hf = t.nextInt(), tj = 0;
        if ((hi >= 0 && hi <= 24) && (hf >= 0 && hf <= 24)) {
            if (hi < hf) {
                tj = hf - hi;
            } else if (hi > hf) {
                tj = (24 - hi) + hf;
            } else {
                tj = 24;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", tj);
        t.close();
    }
}