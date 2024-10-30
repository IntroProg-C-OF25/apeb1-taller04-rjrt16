
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Declaracion de datos o variables
        double costoComputadora, cpu, teclado, pantalla, raton;
        Scanner pe = new Scanner(System.in);
        System.out.print("Dame el costo del cpu: ");
        cpu = pe.nextDouble();
        System.out.print("Dame el costo del tecaldo: ");
        teclado = pe.nextDouble();
        System.out.print("Dame el costo de la pantalla: ");
        pantalla = pe.nextDouble();
        System.out.print("Dame el costo del raton: ");
        raton = pe.nextDouble();
        costoComputadora = raton + cpu + teclado + pantalla;
        System.out.println("Costo total de la computadora = " + costoComputadora);

    }

}
