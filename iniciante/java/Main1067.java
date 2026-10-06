package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1067 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int val = t.nextInt();
        for (int c = 1; c <= val; c++) {
            if (c % 2 == 1) {
                System.out.println(c);
            }
        }
        
        t.close();
    }
}