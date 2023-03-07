package Principal;

import salud.Persona2;

public class Inicio2 {
     public static void main(String[] args) {
        
        Persona2 persona1 = new Persona2();

        persona1.pedirDatos();

        persona1.mostrarPersona();

        persona1.mayorEdad();

        persona1.calcularImc();
        
        String PESOS = persona1.calcularImc();

        if (PESOS == "PESOBAJO"){

         System.out.println("Su peso estaba abajo de lo ideal");

        }else if(PESOS == "PESOIDEAL"){

         System.out.println("Su peso es el ideal");

        }else if(PESOS == "SOBREPESO"){

         System.out.println("Su peso esta por encima de el ideal");

        }

        
     }
}
