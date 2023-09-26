public class Exercisis {
    public static void main(String[] args) {
        Calculadora(4, 2);
    }

    //Exercici 1
    //A aquest programa hem de definir dos nombre enters amb el valor que vulgueu
    //vosaltres. Per pantalla hem de mostrar la suma, la resta, la multiplicació i la divisió
    //d'aquests dos nombres. (Una línia per cada resultat.)

    private static void Calculadora(int num1, int num2) {
        int resultSum, resultRes, resultMul, resultDiv;

        resultSum = num1 + num2;
        resultRes = num1 - num2;
        resultMul = num1 * num2;
        resultDiv = num1 / num2;

        System.out.println("Suma: " + resultSum + "\nResta: " + resultRes + "\nMultiplicació: " + resultMul + "\nDivició: " + resultDiv);
    }

    //Exercici 2
    //A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les notes
    //d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les notes
    //de les 3 avaluacions per pantalla i mostrar el resultat final.


    //Exercici 3
    //A aquesta activitat hem de dissenyar un programa que calculi el sou d'un
    //treballador. Ha de demanar quantes hores fa feina al dia, quants de dies al mes fa
    //feina i a quant cobra les hores. Finalment ha de mostrar el resultat per pantalla.


    //Exercici 4
    //A aquesta activitat hem de dissenyar un programa que sigui capaç de llegir per
    //teclat mitjançant "InputStreamReader" i "BufferedReader" diferents tipus de dades
    //(String, Int, float i double) tenint en compte diferents excepcions utilitzant l'estructura
    //try i catch.


    //Exercici 5 A aquesta activitat hem de dissenyar un programa amb dos mètodes. Un
    //mètode "llegir" haurà d'imprimir per pantalla el contingut per pantalla d'un fitxer local.

}
