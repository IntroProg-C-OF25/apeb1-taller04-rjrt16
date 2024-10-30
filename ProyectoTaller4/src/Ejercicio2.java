
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Declaracion de datos o variables
        double hijo1, hijo2, hijo3, gastototal;
        Scanner pe = new Scanner(System.in);
        System.out.print("Dame el gasto del hijo1: ");
        hijo1 = pe.nextDouble();
        System.out.print("Dame el gasto del hijo2: ");
        hijo2 = pe.nextDouble();
        System.out.print("Dame el gasto del hijo3: ");
        hijo3 = pe.nextDouble();
        gastototal = (hijo1 + hijo2 + hijo3);
        System.out.println("Gasto total de los tres hijos  = " + gastototal);

    }
}
