
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        double netflix, youtube, premium, dropbox, spotify, descuento, totalPagar, totalConDescuento;
        Scanner pe = new Scanner(System.in);
        System.out.print("Ingrese el valor por utilizar netflix: ");
        netflix = pe.nextDouble();
        System.out.print("Ingrese el valor por utilizar youtbue: ");
        youtube = pe.nextDouble();
        System.out.print("Ingrese el valor por utilizar premiun: ");
        premium = pe.nextDouble();
        System.out.print("Ingrese el valor por utilicar dropbox: ");
        dropbox = pe.nextDouble();
        System.out.print("Ingrese el valor por utilizar spotify: ");
        spotify = pe.nextDouble();
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = pe.nextInt();
        totalPagar = (netflix + youtube + premium + dropbox + spotify);
        if (edad <= 30) {
            descuento = totalPagar - (totalPagar * 0.2);
            System.out.println("total del pago = " + descuento);
        } else {

            System.out.println("Total a pagar = " + totalPagar);
        }

    }

}
