public class Contacto {

	private String nombre;
	private String apellido;
	private int telefono;

	//métodos getter y setter

	public void setNombre(String nombreIntroducido) {
		this.nombre = nombreIntroducido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setApellido(String apellidoIntroducido) {
		this.apellido = apellidoIntroducido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setTelefono(int telefonoIntroducido) {
		this.telefono = telefonoIntroducido;
	}

	public int getTelefono() {
		return telefono;
	}
}