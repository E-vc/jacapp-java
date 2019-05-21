package co.com.beans;

public class Comuna extends Datos {
	
	private Zona codigo_z;
	
	public Comuna() {
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

	public Zona getCodigo_z() {
		return codigo_z;
	}

	public void setCodigo_z(Zona codigo_z) {
		this.codigo_z = codigo_z;
	}

}
