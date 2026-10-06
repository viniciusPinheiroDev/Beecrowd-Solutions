package iniciante.java;

import java.io.IOException;
import java.util.Scanner;

public class Main1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        double pi = 3.14159;
        double r = t.nextDouble();
        double ar = pi * (Math.pow(r, 2));
        System.out.format("A=%.4f\n", ar);
        t.close();
    }
 
}