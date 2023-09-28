//Exercici 5 A aquesta activitat hem de dissenyar un programa amb dos mètodes. Un
//mètode "llegir" haurà d'imprimir per pantalla el contingut per pantalla d'un fitxer local.
//(totes les línies). L'altre mètode "escriure" haurà d'escriure el text introduït per pantalla
//al final d'un fitxer donat.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercisi5 {
    public static void main(String[] args) {
        Exercisi5 ex5 = new Exercisi5();
        ex5.menu();
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Llegir contingut del fitxer");
        System.out.println("2. Afegir text al fitxer");
        System.out.print("Escull una opció (1/2): ");
        int opcio = scanner.nextInt();
        scanner.nextLine();

        if (opcio == 1) {
            System.out.print("Introdueix el path(absolut o relatiu) del fitxer a llegir: ");
            String nomFitxer = scanner.nextLine();
            llegir(nomFitxer);
        } else if (opcio == 2) {
            System.out.print("Introdueix el nom del fitxer on vols afegir text: ");
            String nomFitxer = scanner.nextLine();
            System.out.print("Introdueix el text a afegir: ");
            String text = scanner.nextLine();
            escriure(nomFitxer, text);
        } else {
            System.err.println("Opció no vàlida.");
        }

        scanner.close();
    }

    // Mètode per llegir el contingut d'un fitxer i imprimir-lo per pantalla
    private void llegir(String nomFitxer) {
        try {
            System.out.println("\n====================\n");
            BufferedReader br = new BufferedReader(new FileReader(nomFitxer));
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
        }
    }

    // Mètode per escriure text al final d'un fitxer o cerar un fitxer en cas de que no existesqui
    private void escriure(String nomFitxer, String text) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFitxer, true));
            bw.write(text);
            bw.newLine();
            bw.close();
            System.out.println("Text escrit correctament al fitxer: " + nomFitxer);
        } catch (IOException e) {
            System.err.println("Error escrivint al fitxer: " + e.getMessage());
        }
    }
}
