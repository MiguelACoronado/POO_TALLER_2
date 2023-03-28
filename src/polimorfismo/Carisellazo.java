package polimorfismo;

import java.util.Scanner;



public class Carisellazo implements Juego{

private String nombre;
private int eleccion;
private int lanzamiento;
Scanner lectura = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre = lectura.nextLine();
    }

    @Override
    public void jugar() {
       lanzamiento = (int)(Math.random()*2+1);
       System.out.println(nombre + " seleccione 1.Cara 2.Sello");
       eleccion = lectura.nextInt();
    }

    @Override
   public void finalizar() {
        if(lanzamiento==1 && eleccion ==1){
            System.out.println(nombre + " ha salido cara, usted selecciono cara, usted gana");
        }else if(lanzamiento == 1 && eleccion == 2){
            System.out.println(nombre + " ha salido cara, usted selecciono sello, usted pierde");
        }else if(lanzamiento == 2 && eleccion == 2){
            System.out.println(nombre + " ha salido sello, usted selecciono sello, usted gana");
        }else if(lanzamiento == 2 && eleccion == 1){
            System.out.println(nombre + " ha salido sello, usted selecciono cara, usted pierde");
        }
    }
    
}
