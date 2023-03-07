package clase1;
import java.util.Scanner;


public class Animal {
    //Atributos

    private String nombre;
    public int edad;

    Scanner lectura = new Scanner(System.in);

    //Metodos

    public void registrarAnimal() {

       System.out.println("Ingrese el nombre del animal");
       nombre = lectura.nextLine();

       System.out.println("Ingrese la edad del animal");
       edad = lectura.nextInt();

    }

    public void mostrarAnimal() {

        System.out.println("El nombre del animal ingresado es " + nombre + " y tiene " + edad + " años");
    }
}
