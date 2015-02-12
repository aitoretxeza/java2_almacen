
public class Producto {	

	protected String tipo, procedencia;
	protected Distribuidor distribuidor;
	
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
	
	public void setDistribuidor(Distribuidor distribuidorIntroducido){
		this.distribuidor = distribuidorIntroducido;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}
}
