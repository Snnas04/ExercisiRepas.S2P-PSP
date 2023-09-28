//Exercici 3
//A aquesta activitat hem de dissenyar un programa que calculi el sou d'un
//treballador. Ha de demanar quantes hores fa feina al dia, quants de dies al mes fa
//feina i a quant cobra les hores. Finalment ha de mostrar el resultat per pantalla.

public class Exercisi3 {
    public static void main(String[] args) {
        double preuHora = Double.parseDouble(args[0]);
        double hores = Integer.parseInt(args[1]);
        double dies = Integer.parseInt(args[2]);

        Exercisi3 ex3 = new Exercisi3();
        ex3.souTraballador(preuHora, (int) hores, (int) dies);
    }

    private void souTraballador(double preuHora, int hores, int dies) {
        double sou;
        sou = (preuHora * hores) * dies;

        System.out.println(sou);
    }
}
