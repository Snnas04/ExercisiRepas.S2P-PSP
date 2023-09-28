//Exercici 4
//A aquesta activitat hem de dissenyar un programa que sigui capaç de llegir per
//teclat mitjançant "InputStreamReader" i "BufferedReader" diferents tipus de dades
//(String, Int, float i double) tenint en compte diferents excepcions utilitzant l'estructura
//try i catch.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercisi4 {
    public static void main(String[] args) {
        Exercisi4 ex4 = new Exercisi4();
        ex4.Exercisi4();
    }

    private void Exercisi4() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Llegir string
            System.out.print("Introdueix una cadena: ");
            String str = br.readLine();
            System.out.println("Cadena(string) introduida: " + str);

            // Llegir int
            System.out.print("Introduce un número enter: ");
            int enter = Integer.parseInt(br.readLine());
            System.out.println("Número(int) introduit: " + enter);

            // Llegir float
            System.out.print("Introduce un número float: ");
            float decFload = Float.parseFloat(br.readLine());
            System.out.println("Número(float) introduit: " + decFload);

            // Llegir double
            System.out.print("Introduce un número double: ");
            double decDoub = Double.parseDouble(br.readLine());
            System.out.println("Número(double) introduit: " + decDoub);

        } catch (IOException e) {
            System.out.println("Error de entrada/sortida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el número: " + e.getMessage());
        } finally {
            try {
                br.close(); // Tencar BufferedReader
            } catch (IOException e) {
                System.out.println("Error al tencar BufferedReader: " + e.getMessage());
            }
        }
    }
}

