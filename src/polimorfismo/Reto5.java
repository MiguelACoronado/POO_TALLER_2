package polimorfismo;

import java.util.Scanner;

public class Reto5 implements Juego {

    private String nombre;
private int seleccionCompu;
private int seleccionUsuario;
Scanner lectura = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre = lectura.nextLine();
    }

    @Override
    public void jugar() {
        System.out.println("Escoge una opcion para jugar contra la maquina");


		seleccionCompu = (int)(Math.random() * 3) + 1;
		System.out.println("La maquina ya escogio");

		System.out.print("Escoge tu opcion 1.Piedra, 2.Papel, 3=.ijera: ");
		seleccionUsuario = lectura.nextInt();

    }   

    @Override
    public void finalizar() {
        System.out.print("La computadora habia escogido: " + seleccionCompu);
		switch ( seleccionCompu )
		{
			case 1:
				System.out.println("Piedra");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("Empataron!"); break;
					case 2: System.out.println("Ganaste!"); break;
					case 3: System.out.println("La computadora ha ganado!"); break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("La computadora ha ganado!"); break;
					case 2: System.out.println("Empataron!"); break;
					case 3: System.out.println("Ganaste!"); break;
				}
				break;

			case 3:
				System.out.println("Tijera");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("Ganaste!"); break;
					case 2: System.out.println("La computadora ha ganado!"); break;
					case 3: System.out.println("Empataron!"); break;
				}
				break;

                
    }

    }
    
}
