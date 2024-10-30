
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        double valorCostoPorKilovatioHora, numeroDeKilovatios, total, totalDescuento;
        Scanner pe = new Scanner(System.in);
        System.out.print("Cuanto kilovatios consumio por hora: ");
        numeroDeKilovatios = pe.nextDouble();
        System.out.print("Valor de kilovatio/hora: ");
        valorCostoPorKilovatioHora = pe.nextDouble();

        int edad;
        System.out.print("Ingrese edad: ");
        edad = pe.nextInt();
        if (edad >= 65) {
            total = (numeroDeKilovatios * valorCostoPorKilovatioHora);
            totalDescuento = total - (total * 0.1);
            System.out.println("Valor total a cancelar = " + totalDescuento);
        } else {
            total = (numeroDeKilovatios * valorCostoPorKilovatioHora);
            System.out.println("valor total a cancelar  = " + total);
        }
    }

}
