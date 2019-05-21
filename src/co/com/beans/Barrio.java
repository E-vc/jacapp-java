package co.com.beans;

public class Barrio extends Datos {
	
	private String postal;
	
	public Barrio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}

	@Override
	public void setCodigo(String codigo) {
		// TODO Auto-generated method stub
		super.setCodigo(codigo);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}
	
}
