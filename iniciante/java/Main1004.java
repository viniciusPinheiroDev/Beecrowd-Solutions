package iniciante.java;
import java.io.IOException;
import java.util.Scanner;

public class Main1004 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt(), b = t.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
        t.close();
    }
 
}