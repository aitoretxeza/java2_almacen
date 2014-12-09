public class Manzana {

	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;

	//métodos getter y setter

	public void setTipoManzana(String tipoManzanaIntroducido) {
		this.tipoManzana = tipoManzanaIntroducido;
	}

	public String getTipoManzana() {
		return this.tipoManzana;
	}

	public void setProcedencia(String procedenciaIntroducido) {
		this.procedencia = procedenciaIntroducido;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setColor(String colorIntroducido) {
		this.color = colorIntroducido;
	}

	public String getColor() {
		return this.color;
	}

	public void setEurosKilo(Double eurosKiloIntroducido) {
		this.eurosKilo = eurosKiloIntroducido;
	}

	public Double getEurosKilo() {
		return this.eurosKilo;
	}

	public void setDistribuidor(Distribuidor distribuidorIntroducido) {
		this.distribuidor = distribuidorIntroducido;
	}

	public Distribuidor getDistribuidor() {
		return this.distribuidor;
	}
}