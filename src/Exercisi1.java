//Exercici 1
//A aquest programa hem de definir dos nombre enters amb el valor que vulgueu
//vosaltres. Per pantalla hem de mostrar la suma, la resta, la multiplicació i la divisió
//d'aquests dos nombres. (Una línia per cada resultat.)

public class Exercisi1 {
    public static void main(String[] args) {
        Exercisi1 ex1 = new Exercisi1();
        ex1.Calculadora(4, 2);

    }

    private void Calculadora(int num1, int num2) {
        int resultSum, resultRes, resultMul, resultDiv;

        resultSum = num1 + num2;
        resultRes = num1 - num2;
        resultMul = num1 * num2;
        resultDiv = num1 / num2;

        System.out.println("Suma: " + resultSum + "\nResta: " + resultRes + "\nMultiplicació: " + resultMul + "\nDivició: " + resultDiv);
    }
}
