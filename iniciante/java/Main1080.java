package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1080 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int mVal = 0, pos = 0;

        for (int c = 1; c <= 100; c++) {
            int val = t.nextInt();
            if (val > mVal) {
                mVal = val;
                pos = c;
            }
        }

        System.out.println(mVal);
        System.out.println(pos);
        t.close();

    }
}