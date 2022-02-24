package co.poli.edu.hotel.model;
import java.util.*;

public class Persona {
	
	private String nit;
	private String nombreCompleto;
	private String tipoDocumento;
	private String fechaNacimiento;
	private Date formatFechaNacimiento;
	private String email;
	private String telefono;
	
	
	public Persona() {
		
	}

	public Persona(String nit, String nombreCompleto, String tipoDocumento, String fechaNacimiento, String email,
			String telefono) {
		super();
		this.nit = nit;
		this.nombreCompleto = nombreCompleto;
		this.tipoDocumento = tipoDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.telefono = telefono;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento1) {
		switch(tipoDocumento1) {
		case 1: 
			if(tipoDocumento1==1)
			tipoDocumento = "Cedula";
		case 2:
			if(tipoDocumento1==2)
			tipoDocumento = "Pasaporte";
		case 3:
			if(tipoDocumento1==3)
			tipoDocumento = "Visa";
		
		}
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nit=" + nit + ", nombreCompleto=" + nombreCompleto + ", tipoDocumento="
				+ (tipoDocumento) + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
}
