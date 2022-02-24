package co.poli.edu.hotel.model;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		//Mensaje de prueba desde Windows :)
		
		
		//Creaci�n de OBJETOS:  -----
		Habitacion habitacion = new Habitacion();
		Persona persona = new Persona();
		//Creaci�n del escaner: -----
		Scanner tc = new Scanner (System.in);
		
		//Iniciar vista - Datos cliente:
		//-> Solicitar nombre completo
		System.out.println("Ingresa tu nombre completo: ");
		persona.setNombreCompleto(tc.nextLine());
		//-> Solicitar Tipo de documento (Opciones mientras se desarrolla el front con el desplegable de opciones)
		System.out.println("Ingresa tu tipo de documento: ");
		persona.setTipoDocumento(tc.nextInt());
		//-> Solicitar n�mero de documento:
		System.out.println("Ingresa tu n�mero de documento: ");
		persona.setNit(tc.next());
		//-> Solicitar fecha de nacimiento:
		System.out.println("Ingresa tu fecha de nacimiento: dd/MM/yyyy");
		persona.setFechaNacimiento(tc.next());
		//-> Solicitar Email
		System.out.println("Ingresa tu email: ");
		persona.setEmail(tc.next());
		//-> Solicitar n�mero telef�nico		
		System.out.println("Ingresa tu n�mero telefonico: ");
		persona.setTelefono(tc.next());


		System.out.println(persona.toString());
		int reservarDeNuevo = 1;
		int n = 0;
		int nuevaReserva = 0;
		while(reservarDeNuevo > 0) {
			//Iniciar datos de la reserva:
			System.out.println("Realiza la reserva: \nOpc 1: Estandar 1, \nOpc 2: Estandar 2");
			n = tc.nextInt();
			if(habitacion.realizarReserva(n)>0) {
				if(n == 1)
				System.out.println("Se realizo la reserva con �xito, habitaciones Estandar I disponibles: "+habitacion.getHabitacionEstandarI());
				if(n==2)
				System.out.println("Se realizo la reserva con �xito, habitaciones Estandar I disponibles: "+habitacion.getHabitacionEstandarII());
				
				System.out.println("Deseas realizar una nueva reserva? 1:Si - 2:No");
				nuevaReserva = tc.nextInt();
				if(nuevaReserva == 1) {
					reservarDeNuevo++;
				}
				else {
					break;
				}
			}
		}

		//Iniciar datos de medio de pago:

	}
}