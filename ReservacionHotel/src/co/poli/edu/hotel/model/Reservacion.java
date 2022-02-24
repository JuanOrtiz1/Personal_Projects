package co.poli.edu.hotel.model;
import java.util.*;

public class Reservacion {
	static Scanner kb = new Scanner (System.in);
	
	private static int habitacionEstandarI = 10;
	private static int habitacionEstandarII = 5;
	private static int suite= 5;
	public  static String habitacion;
	
	
	public  static void main(String[] args) {
		Date date = new Date ();
		String ga ;
		
		
		System.out.println("Pls insert the option:\n"
				+ "1.Reservar Estandar I\n"
				+ "2.Reservar Estandar II\n"
				+ "3.Reservar Suite\n"
				+"Inserta la opción: ");
		
		int opc = iniciarReservaHotel();
		switch (opc) {
		case 1:
			if(opc == 1)
			System.out.println(reservarHabitacionEstandarI(opc));
			habitacion = "Estandar I";
		case 2:
			if(opc == 2)
			System.out.println(reservarHabitacionesEstandarII(opc));
		case 3:
			if(opc == 3)
			System.out.println(reservarHabitacionesSuite(opc));
		default:
			break;
		}
		
		System.out.println("¿Quieres conocer los detalles de tu reserva?");
		opc= kb.nextInt();
		
		switch (opc) {
		case 1:
			if(opc == 1)
			System.out.println(infoReserva(habitacion));
		case 2:
			if(opc == 2)
			System.out.println(infoReserva(habitacion));
		default:
			break;
		}
		
}
	
	
	
	
	//Iniciar con la reserva.
	public static int iniciarReservaHotel() {
		int opc = kb.nextInt();
		return opc;
	}																												
	
	
	public static int reservarHabitacionEstandarI(int a) {
		habitacionEstandarI = habitacionEstandarI - 1;
		habitacion = "Estandar I";
		return habitacionEstandarI;
		
	}
	
	public static int reservarHabitacionesEstandarII(int a) {
		habitacionEstandarII = habitacionEstandarII - 1;
		habitacion = "Estandar II";
		return habitacionEstandarII;
	}
	
	public static int reservarHabitacionesSuite(int a) {
		suite = suite - 1;
		habitacion = "Suite";
		return suite;
	}
	
	public static String infoReserva(String habitacion) {
		return habitacion;
	}
	
	
}
