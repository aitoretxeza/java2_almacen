public class Lechuga {

	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;

	//métodos getter y setter

	public void setTipoLechuga (String tipoLechugaIntroducido) {
		this.tipoLechuga = tipoLechugaIntroducido;
	}

	public String getTipoLechuga () {
		return this.tipoLechuga;
	}

	public void setProcedencia (String procedenciaIntroducido) {
		this.procedencia = procedenciaIntroducido;
	}

	public String getProcedencia () {
		return this.procedencia;
	}

	public void setColor (String colorIntroducido) {
		this.color = colorIntroducido;
	}

	public String getColor () {
		return this.color;
	}

	public void setEurosUnidad (Double eurosUnidadIntroducido) {
		this.eurosUnidad = eurosUnidadIntroducido;
	}

	public Double getEurosUnidad () {
		return this.eurosUnidad;
	}

	public void setDistribuidor (Distribuidor distribuidorIntroducido) {
		this.distribuidor = distribuidorIntroducido;
	}

	public Distribuidor getDistribuidor () {
		return this.distribuidor;
	}
}