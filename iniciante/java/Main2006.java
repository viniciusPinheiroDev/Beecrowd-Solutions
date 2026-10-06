package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main2006 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int cha = t.nextInt();
        int concorrentes = 0;

        for(int c = 0; c < 5; c++) {
            int resp = t.nextInt();
            if(resp == cha) {
                concorrentes++;
            }
        }
        System.out.println(concorrentes);
        t.close();
    }
}