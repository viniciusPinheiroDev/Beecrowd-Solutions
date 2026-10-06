package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1042 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int a = t.nextInt(), b = t.nextInt(), c = t.nextInt(), m1 = 0, m2 = 0, m3 = 0;

        if (a > b && a > c) {
            m1 = a;
            if (b > c) {
                m2 = b;
                m3 = c;
            } else {
                m2 = c;
                m3 = b;
            }
        } else if (b > a && b > c) {
            m1 = b;
            if (a > c) {
                m2 = a;
                m3 = c;
            } else {
                m2 = c;
                m3 = a;
            }
        } else if (c > a && c > b) {
            m1 = c;
            if (a > b) {
                m2 = a;
                m3 = b;
            } else {
                m2 = b;
                m3 = a;
            }
        } 
        System.out.printf("%d%n%d%n%d%n%n%d%n%d%n%d%n", m3, m2, m1, a, b, c);
        t.close();
    }
}