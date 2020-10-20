package ADAS.ada2_elCurp;

public class listaPersonas {
	
	public Persona arrPersonas[];
	
	listaPersonas(Persona[] arrPersonas){
		this.arrPersonas = arrPersonas;
	}
	
	listaPersonas(){
		this.arrPersonas = new Persona[10];
	}

	public Persona[] getArrPersonas() {
		return arrPersonas;
	}

	public void setArrPersonas(Persona[] arrPersonas) {
		this.arrPersonas = arrPersonas;
	}
	
	
}
