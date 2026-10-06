package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int hi = t.nextInt(), mi = t.nextInt(), hf = t.nextInt(), mf = t.nextInt(), th = 0, tm = 0;
        int mit = (hi * 60) + mi, mft = (hf * 60) + mf;
        
        if (mit < mft) {
            tm = mft - mit;
        } else if (mit == mft) {
            th = 24;
        } else {
            tm = ((24 * 60) - mit) + mft;
        }
        while (tm > 59) {
            th++;
            tm -= 60;
        }

        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", th, tm);
        t.close();
    }
}