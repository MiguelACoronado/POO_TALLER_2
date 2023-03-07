package clase1;

public class Prueba {
    public static void main(String[] args) {
        
        Animal guacamayo = new Animal();

        Movie titanic = new Movie();

        guacamayo.registrarAnimal();//invocar un metodo

        guacamayo.mostrarAnimal();

        int duplicado=guacamayo.duplicarEdad();

        System.out.println("El numero duplicado del animal es: " + duplicado);
    }

     
}
