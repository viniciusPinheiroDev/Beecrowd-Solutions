package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1020 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int dia = t.nextInt(), ano = 0, mes = 0;
            while (dia >= 365) {
                dia -= 365;
                ano++;
        }   
            while (dia >= 30) {
                dia -= 30;
                mes++;
        } 
        System.out.format("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, mes, dia);       
        t.close(); 
    }
}