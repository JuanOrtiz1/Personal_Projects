package co.poli.edu.hotel.model;

public class Habitacion extends Hotel {
	
	private int habitacionEstandarI = 10;
	private int habitacionEstandarII = 5;
	private int suite= 5;
	private String habitacion;
	
	public Habitacion() {
		
	}
	
	public Habitacion(int habitacionEstandarI, int habitacionEstandarII, int suite, String habitacion) {
		super();
		this.habitacionEstandarI = habitacionEstandarI;
		this.habitacionEstandarII = habitacionEstandarII;
		this.suite = suite;
		this.habitacion = habitacion;
	}


	public int getHabitacionEstandarI() {
		return habitacionEstandarI;
	}

	public int getHabitacionEstandarII() {
		return habitacionEstandarII;
	}


	public int getSuite() {
		return suite;
	}


	public String getHabitacion() {
		return habitacion;
	}
	
	
	public int realizarReserva(int n) {
		int temp=0;
		switch(n) {
		case 1:
			if(habitacionEstandarI > 0)
			habitacionEstandarI = habitacionEstandarI - 1; 
			temp = habitacionEstandarI;
			return habitacionEstandarI;
		case 2:
		if(habitacionEstandarII > 0)
		habitacionEstandarII = habitacionEstandarII - 1; 
		temp = habitacionEstandarII;
		return habitacionEstandarII;
	}
		return temp;
			
				
	}
	
	
	public boolean reservarEstandarI(int habitacionEstandarI) {
		boolean reservado = false;
		if(habitacionEstandarI > 0) {
			habitacionEstandarI = habitacionEstandarI - 1;
			reservado = true;
		}else {
			reservado = false;
		}
		return reservado;
	}
	
	public int realizarNuevaReserva(int n) {
		if(n == 1) {
			realizarReserva(n);
		}else {
			return n;
		}
		return n;
	}
	
	
	
	
}
