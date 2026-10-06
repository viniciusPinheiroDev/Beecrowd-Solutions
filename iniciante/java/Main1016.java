package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1016 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int di = t.nextInt();
        int tN = di * 2;
        System.out.println(tN + " minutos");
        t.close();
    }
 
}