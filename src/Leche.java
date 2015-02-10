public class Leche extends Producto {

	private Double eurosLitro;

	//métodos getter y setter

	public void setTipo(String tipoIntroducido){
		this.tipo = tipoIntroducido;
	}

	public String getTipo(){
		return this.tipo;
	}

	public void setProcedencia(String procedenciaIntroducido){
		this.procedencia = procedenciaIntroducido;
	}

	public String getProcedencia(){
		return this.procedencia;
	}

	public void setEurosLitro(Double eurosLitroIntroducido){
		this.eurosLitro = eurosLitroIntroducido;
	}

	public Double getEurosLitro(){
		return this.eurosLitro;
	}

	public void setDistribuidor(Distribuidor distribuidorIntroducido){
		this.distribuidor = distribuidorIntroducido;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}
}