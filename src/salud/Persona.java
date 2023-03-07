package salud;

import java.util.Scanner;

public class Persona {
    //Atributos

    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    double peso;
    double estatura;
    int edad;
    String sexo;
    

    
    Scanner lectura = new Scanner(System.in);
    //Metodos

    public void pedirDatos(){

       System.out.println("Ingrese su tipo de documento");
       tipoDoc = lectura.nextLine();

       System.out.println("Ingrese su documento");
       documento = lectura.nextInt();

       lectura.nextLine();

       System.out.println("Ingrese su nombre");
       nombre = lectura.nextLine();

       System.out.println("Ingrese su apellido");
       apellido = lectura.nextLine();

       System.out.println("Ingrese su peso en kilogramos");
       peso = lectura.nextDouble();

       System.out.println("Ingrese su estatura en metros");
       estatura = lectura.nextDouble();

       System.out.println("Ingrese su edad");
       edad = lectura.nextInt();

       lectura.nextLine();

       System.out.println("Ingrese su sexo");
       sexo = lectura.nextLine();

    }

    public void mostrarPersona(){

        System.out.println("Tipo de docuemnto: " + tipoDoc);
 
        System.out.println("Documento: " + documento);
 
        System.out.println("Nombre: " + nombre);
 
        System.out.println("Apellido: " + apellido);
 
        System.out.println("Peso: " + peso);
 
        System.out.println("Estatura: " + estatura);
 
        System.out.println("Edad:" + edad);
 
        System.out.println("Sexo: " + sexo);
    }

    public void calcularImc(){
        
        Double pesoActual;

        pesoActual = (peso/estatura)+(peso/estatura);

        System.out.println("Su peso Actual es: " + pesoActual);

        if (pesoActual < 20){

            System.out.println("Su peso esta por debajo del ideal");

        }else if(pesoActual >=20 && pesoActual<=25){

            System.out.println("Su peso es el ideal");

        }else{

            System.out.println("Su peso esta por encima del ideal");

        }

    }

    public void mayorEdad(){

        if(edad <= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
}
