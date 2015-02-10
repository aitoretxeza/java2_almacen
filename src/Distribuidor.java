public class Distribuidor {

	private String nombre, cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter

	public void setNombre(String nombreIntroducido){
		this.nombre = nombreIntroducido;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setCif(String cifIntroducido){
		this.cif = cifIntroducido;
	}

	public String getCif(){
		return this.cif;
	}

	public void setDireccion(Direccion direccionIntroducido){
		this.direccion = direccionIntroducido;
	}

	public Direccion getDireccion(){
		return this.direccion;
	}

	public void setPersonaContacto(Contacto personaContactoIntroducido){
		this.personaContacto = personaContactoIntroducido;
	}

	public Contacto getPersonaContacto(){
		return this.personaContacto;
	}
}