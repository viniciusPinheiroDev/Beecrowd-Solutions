package iniciante.java;

import java.io.IOException;
import java.util.Scanner;

public class Main1003 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt(), b = t.nextInt();
        int so = a + b;
        System.out.println("SOMA = " + so);
        t.close();
    }
 
}