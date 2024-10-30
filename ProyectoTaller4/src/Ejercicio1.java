
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de datos o variables
        double base, altura, area;
        Scanner pe = new Scanner(System.in);
        //ingreso de datos de entrada 
        System.out.print("Dame la base: "); //carpinteria de salida 
        base = pe.nextDouble(); //datos de entrada 
        System.out.print("Dame la altura: ");
        altura = pe.nextDouble();
        //Bloque de procesacimiento de datos 
        area = (base*altura)/2;
        System.out.println("area del triangulo es = " + area);
        
    }
}
