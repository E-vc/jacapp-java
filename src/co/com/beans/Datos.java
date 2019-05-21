package co.com.beans;

public class Datos {
	
	private String codigo;
	private String nombre;
	
	public Datos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datos(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

}
