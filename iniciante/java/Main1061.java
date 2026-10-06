package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1061 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int w = 0, x = 0, y = 0, z = 0;
        t.next();
        int d1 = t.nextInt();
        int h1 = t.nextInt();
        t.next();
        int m1 = t.nextInt();
        t.next();
        int s1 = t.nextInt();
        t.next();
        int d2 = t.nextInt();
        int h2 = t.nextInt();
        t.next();
        int m2 = t.nextInt();
        t.next();
        int s2 = t.nextInt();

        if (s1 <= s2) {
            z = s2 - s1;
        } else {
            s2 += 60;
            z = s2 - s1;
            m2 -= 1;
        } if (m1 <= m2) {
            y = m2 - m1;
        } else {
            m2 += 60;
            y = m2 - m1;
            h2 -= 1;
        } if (h1 <= h2) {
            x = h2 - h1;
        } else {
            h2 += 24;
            x = h2 - h1;
            d2 -= 1;
        } if (d1 <= d2) {
            w = d2 - d1;
        } 

        System.out.printf("%d dia(s)%n%d hora(s)%n%d minuto(s)%n%d segundo(s)%n", w, x, y, z);




        t.close();
    }
}