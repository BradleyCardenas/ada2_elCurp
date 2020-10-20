package ADAS.ada2_elCurp;

public class Estado {
	
	private String nombre;
	private String abrev;
	
	public Estado(String nombre, String abrev) {
		this.nombre = nombre;
		this.abrev = abrev;
	}
	
	public Estado() {}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbrev() {
		return abrev;
	}

	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
}
