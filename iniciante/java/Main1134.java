package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

class Main1134 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int alcool = 0, gasolina = 0, diesel = 0;

        while (true) {
            int tipoGasolina = t.nextInt();

            if (tipoGasolina == 4) {
                break;
            } else if (tipoGasolina == 1) {
                alcool++;
            } else if (tipoGasolina == 2) {
                gasolina++;
            } else if (tipoGasolina == 3) {
                diesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);

        t.close();
    }
    
}