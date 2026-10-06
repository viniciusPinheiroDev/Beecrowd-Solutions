package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1019 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int seg = t.nextInt(), min = 0, hor = 0;
        while (seg >= 60) {
            seg -= 60;
            min++;
        }   while (min >= 60) {
            min -= 60;
            hor++;
        }
        System.out.printf("%d:%d:%d%n", hor, min, seg);
        t.close();
    }
 
}