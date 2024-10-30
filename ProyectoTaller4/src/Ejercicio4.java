import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
         //Declaracion de datos o variables
        double costoMinuto, CantidadMinutos, valorPlanilla;
        Scanner pe = new Scanner(System.in);
        System.out.print("Dame costo por minuto: ");
        costoMinuto = pe.nextDouble();
        System.out.print("Dame la cantidad e minutos: ");
        CantidadMinutos = pe.nextDouble();
        valorPlanilla = costoMinuto * CantidadMinutos;
        System.out.println("valorPlanilla = " + valorPlanilla);
        
    }
}
