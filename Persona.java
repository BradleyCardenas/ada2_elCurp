package ADAS.ada2_elCurp;

import java.util.Date;

import javax.swing.JOptionPane;

public class Persona {

	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String dia;
	String mes; 
	String anio;
	boolean Hombre;
	Estado estado;
	String indice;
	String Curp;

	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) throws RuntimeException {
		if(esNumero(nombre) == true) {
			throw new RuntimeException("Solo se aceptan letras en el nombre");
		} else {
			this.nombre = nombre;
		}
		
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) throws RuntimeException {
		if(esNumero(apellidoPaterno) == true ) {
			throw new RuntimeException("Solo se aceptan letras en el apellido paterno");
		} else {
			this.apellidoPaterno = apellidoPaterno;
		}
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) throws RuntimeException {
		if(esNumero(apellidoMaterno) == true) {
			throw new RuntimeException("Solo se aceptan letras en el apellido materno");
		} else {
			this.apellidoMaterno = apellidoMaterno;
		}
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setMes(int mes) {
		this.mes = Integer.toString(mes);
	}

	public String getAnio() {
		return anio;
	}


	public void setAnio(String anio) {
		if (anio.length() != 4) {
			generarError("La fecha tiene que ser de 4 dígitos");
		} else {
			this.anio = anio;
		}
		
	}

	public boolean esHombre() {
		return Hombre;
	}


	public void setHombre(boolean esHombre) {
		this.Hombre = esHombre;
	}
	
	
	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public String getCurp() {
		return Curp;
	}


	public void setCurp(String curp) {
		Curp = curp;
	}


	
	public String getIndice() {
		return indice;
	}


	public void setIndice(String indice) {
		this.indice = indice;
	}


	public String generateCurp() {
		String CURP ="";
		
		char inicialNombre = getNombre().charAt(0);
		char primeraVocalNombre = primeraVocal(getNombre());
		char inicialApellidoPaterno = getApellidoPaterno().charAt(0);
		char inicialApellidoMaterno = getApellidoMaterno().charAt(0);
		CharSequence anio = getAnio().subSequence(2, 4);
		String mes = rellenarConCero(getMes());
		String dia = rellenarConCero(getDia());
		char sexo = sexo(esHombre());
		String estado = getEstado().getAbrev();
		char consonanteNombre = primeraConsonante(getNombre());
		char consonanteApellidoPaterno = primeraConsonante(getApellidoPaterno());
		char consonanteApellidoMaterno = primeraConsonante(getApellidoMaterno());
		String indice = rellenarConCero(getIndice());
		
		String primerosCaracteres = new String(new char[] {inicialNombre, primeraVocalNombre, inicialApellidoPaterno, inicialApellidoMaterno});		
		String segundosCaracteres = new String(new char[] {sexo});
		String tercerosCaracteres = new String(new char[] {consonanteNombre, consonanteApellidoPaterno, consonanteApellidoMaterno});
		
		CURP =  primerosCaracteres + anio + mes + dia + segundosCaracteres + estado + tercerosCaracteres + indice;
				
		return CURP;
	}

	public String rellenarConCero(String mes) {
		if (Integer.parseInt(mes) < 10) {
			return "0" + mes;
		} else {
			return mes;
		}
	}
	
	public char sexo(boolean bool) {
		if (bool == true) {
			return 'M';
		} else {
			return 'F';
		}
	}
	
	public char primeraVocal(String string) {
		char cadena[] = string.toCharArray();
		char vocal = 'a'; 
		boolean bandera = false;
		
		for(int i=0; i<cadena.length; i++) {
			if (bandera == false){
				switch (cadena[i]) {
				case 'A': vocal = 'A'; bandera = true; break;
				case 'E': vocal = 'E'; bandera = true; break;
				case 'I': vocal = 'I'; bandera = true; break;
				case 'O': vocal = 'O'; bandera = true; break;
				case 'U': vocal = 'U'; bandera = true; break;
				default: vocal = 0; break;
	 			}
			}
		}
		return vocal;
	}
	
	public char primeraConsonante(String string) {
		char cadena[] = string.toCharArray();
		char consonante = 0; 
		boolean bandera = false;
		
		for(int i=1; i<cadena.length; i++) {
			if (bandera == false){
				switch (cadena[i]) {
				case 'B': consonante = 'B'; bandera = true; break;
				case 'C': consonante = 'C'; bandera = true; break;
				case 'D': consonante = 'D'; bandera = true; break;
				case 'F': consonante = 'F'; bandera = true; break;
				case 'G': consonante = 'G'; bandera = true; break;
				case 'H': consonante = 'H'; bandera = true; break;
				case 'J': consonante = 'J'; bandera = true; break;
				case 'K': consonante = 'K'; bandera = true; break;
				case 'L': consonante = 'L'; bandera = true; break;
				case 'M': consonante = 'M'; bandera = true; break;
				case 'N': consonante = 'N'; bandera = true; break;
				case 'P': consonante = 'P'; bandera = true; break;
				case 'Q': consonante = 'Q'; bandera = true; break;
				case 'R': consonante = 'R'; bandera = true; break;
				case 'S': consonante = 'S'; bandera = true; break;
				case 'T': consonante = 'T'; bandera = true; break;
				case 'V': consonante = 'V'; bandera = true; break;
				case 'X': consonante = 'X'; bandera = true; break;
				case 'Y': consonante = 'Y'; bandera = true; break;
				case 'Z': consonante = 'Z'; bandera = true; break;
				default: consonante = 0; break;
	 			}
			}
		}
		return consonante;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void generarError(String mensaje) throws RuntimeException {
		throw new RuntimeException(mensaje);
	}
	
	public boolean esNumero(String contenido) {
		try {
			Integer.parseInt(contenido);
			return true;
		} catch(NumberFormatException numberFormatException) {
			return false;
		}
	}
	
	
}
