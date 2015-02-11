public class Lechuga extends Producto {

	private String color;
	private Double eurosUnidad;

	//métodos getter y setter

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
}