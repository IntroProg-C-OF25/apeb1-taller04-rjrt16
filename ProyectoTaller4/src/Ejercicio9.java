
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        double lado, altura, areaPoligono, cuadradoPerfecto, trianguloRectangulo, areaRectangulo;
        Scanner pe = new Scanner(System.in);
        System.out.print("Dame el lado del rectangulo: ");
        lado = pe.nextDouble();
        System.out.print("Dame la altura del rectangulo: ");
        altura = pe.nextDouble();
        cuadradoPerfecto = lado * lado;
        System.out.println("area del cuadradoPerfecto = " + cuadradoPerfecto);
        trianguloRectangulo = (lado * altura) / 2 * 3;
        System.out.println("area del trianguloRectangulo = " + trianguloRectangulo);
        areaRectangulo = (lado * altura);
        System.out.println("area del rectangulo = " + areaRectangulo);
        areaPoligono = cuadradoPerfecto + trianguloRectangulo + areaRectangulo;
        System.out.println("area del poligono = " + areaPoligono);
    }

}
