package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1041 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double x = t.nextDouble(), y = t.nextDouble();
        x = Math.floor(x * 10) / 10;
        y = Math.floor(y * 10) / 10;
        if (x == y && y == 0) {
            System.out.println("Origem");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        t.close();

    }
}