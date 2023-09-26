//Exercici 2
//A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les notes
//d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les notes
//de les 3 avaluacions per pantalla i mostrar el resultat final.

public class Exercisi2 {
    public static void main(String[] args) {
        Exercisi2 ex2 = new Exercisi2();
        ex2.Mitjana("Marc Sans", 6.8, 7.2, 6.6);
        System.out.println("============");
        ex2.Mitjana("Alumne 2", 7.8, 6.5, 7.2);
    }

    private void Mitjana(String alumne, double primerTrimestre, double segonTrimestre, double tercerTrimestre) {
        double mitjana;
        int mitjanaArrodonida;

        // calculam la mitjana i passam de decimals a enters
        mitjana = (primerTrimestre + segonTrimestre + tercerTrimestre)/3;
        mitjanaArrodonida = (int) mitjana;

        // amb aquest if feim que se arrodonesqui la nota per adalt sempre que superi o iguali el x.7
        // he posat 0.7 perque crec que es lo més comú entre professors
        if (mitjana - mitjanaArrodonida >= 0.7) {
            mitjanaArrodonida+=1;
        }

        // mostram el nom de l'alumne i les dues mitjanes, la mitjana amb decimals li aplicam un format perque nomes mostri dos decimals
        System.out.println(alumne + ":\n" + String.format("%.2f", mitjana) + " -> " + mitjanaArrodonida);
    }
}
