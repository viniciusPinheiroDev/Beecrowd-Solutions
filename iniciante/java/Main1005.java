package iniciante.java;

import java.io.IOException;
import java.util.Scanner;

public class Main1005 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        double a  = t.nextDouble(), b = t.nextDouble();
        double me = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.format("MEDIA = %.5f%n", me);
        t.close();
    }
 
}