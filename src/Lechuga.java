public class Lechuga extends Producto {

	private String color;
	private Double eurosUnidad;

	//métodos getter y setter

	public void setTipoLechuga(String tipoLechugaIntroducido){
		this.tipo = tipoLechugaIntroducido;
	}

	public String getTipoLechuga(){
		return this.tipo;
	}

	public void setProcedencia(String procedenciaIntroducido){
		this.procedencia = procedenciaIntroducido;
	}

	public String getProcedencia(){
		return this.procedencia;
	}

	public void setColor(String colorIntroducido){
		this.color = colorIntroducido;
	}

	public String getColor(){
		return this.color;
	}

	public void setEurosUnidad(Double eurosUnidadIntroducido){
		this.eurosUnidad = eurosUnidadIntroducido;
	}

	public Double getEurosUnidad(){
		return this.eurosUnidad;
	}

	public void setDistribuidor(Distribuidor distribuidorIntroducido){
		this.distribuidor = distribuidorIntroducido;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}
}