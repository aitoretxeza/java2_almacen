public class Cliente {

	private String nombre;
	private String apellidos;
	private String dni;
	private Direccion direccion;
	private Double numeroSocio;
	private Double dto;

	//métodos getter y setter

	public void setNombre(String nombreIntroducido) {
		this.nombre = nombreIntroducido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setApellidos(String apellidosIntroducido) {
		this.apellidos = apellidosIntroducido;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setDni(String dniIntroducido) {
		this.dni = dniIntroducido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDireccion(Direccion direccionIntroducido) {
		this.direccion = direccionIntroducido;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setNumeroSocio(Double numeroSocioIntroducido) {
		this.numeroSocio = numeroSocioIntroducido;
	}

	public Double getNumeroSocio() {
		return this.numeroSocio;
	}

	public void setDto(Double dtoIntroducido) {
		this.dto = dtoIntroducido;
	}

	public Double getDto() {
		return this.dto;
	}
}