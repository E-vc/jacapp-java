package co.com.beans;

public class Persona {
	
	private String documento;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String ocupacion;
	private Genero genero;
	
	public Persona() {
		super();
	}
	
	public Persona(String documento, String nombres, String apellidos, String telefono, String direccion, String ocupacion, Genero genero) {
		super();
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ocupacion = ocupacion;
		this.genero = genero;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
