package iniciante.java;
import java.io.IOException;
import java.util.Scanner;

public class Main1006 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        double a = t.nextDouble(), b = t.nextDouble(), c = t.nextDouble();
        double me = (a * 2 + b * 3 + c * 5) / 10;
        System.out.format("MEDIA = %.1f%n", me);
        t.close();
    }
 
}