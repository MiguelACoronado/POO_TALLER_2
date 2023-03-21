package polimorfismo;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        int op,lado,altura,base,radio;
        

        System.out.println("Que area quiere hallar 1.cuadrado 2.rectangulo 3.triangulo 4.circulo");
        op = lectura.nextInt();

        switch (op){
            case 1:

            System.out.println("escriba el lado del cuadrado");
            lado = lectura.nextInt();
            cuadrado.setLado(lado);
            cuadrado.calcularArea();

            break;
            case 2:

            System.out.println("escriba la altura del triangulo");
            altura = lectura.nextInt();
            System.out.println("escriba la base del triangulo");
            base = lectura.nextInt();
            rectangulo.setAltura(altura);
            rectangulo.setBase(base);
            rectangulo.calcularArea();

            break;
            case 3:

            System.out.println("escriba la altura del triangulo");
            altura = lectura.nextInt();
            System.out.println("escriba la base del triangulo");
            base = lectura.nextInt();
            triangulo.setAltura(altura);
            triangulo.setBase(base);
            triangulo.calcularArea();

            break;
            case 4:

            System.out.println("escriba el radio del circulo");
            radio = lectura.nextInt();
            circulo.setRadio(radio);
            circulo.calcularArea();

            break;
            default:

            System.out.println("Escriba un numero que corresponda");
 
            break;
        }

        lectura.close();
    }
}
