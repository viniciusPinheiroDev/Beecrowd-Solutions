package iniciante.java;

import java.io.IOException;
import java.util.Scanner;

public class Main1007 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt(), b =  t.nextInt(), c = t.nextInt(), d = t.nextInt();
        int di = (a * b - c * d);
        System.out.format("DIFERENCA = %d%n", di);
        t.close();

    }
 
}