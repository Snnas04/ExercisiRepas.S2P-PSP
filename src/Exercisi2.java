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

        mitjana = (primerTrimestre + segonTrimestre + tercerTrimestre)/3;
        mitjanaArrodonida = (int) mitjana;

        if (mitjana - mitjanaArrodonida > 0.7) {
            mitjanaArrodonida+=1;
        }

        System.out.println(alumne + ":\n" + String.format("%.2f", mitjana) + " -> " + mitjanaArrodonida);
    }
}
