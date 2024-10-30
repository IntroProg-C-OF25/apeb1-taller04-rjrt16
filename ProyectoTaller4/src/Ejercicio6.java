
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        double montoDelPrestamo, pagoMensual, interes, pagoConIntereses, pagoTotal;
        Scanner pe = new Scanner(System.in);

        System.out.print("Dame la cantidad del monto del prestamo: ");
        montoDelPrestamo = pe.nextDouble();
        System.out.print("Dame el interes: ");
        interes = pe.nextDouble();
        interes = interes / 100;
        pagoMensual = montoDelPrestamo / 12;
        pagoConIntereses = (interes * pagoMensual);
        pagoTotal = (pagoConIntereses * pagoMensual);
        System.out.println("Valor total a pagar = " + pagoTotal);

    }

}
