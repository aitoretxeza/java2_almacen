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

	//metodos para guardar una lechuga

	public void guardarLechuga(){

		System.out.print("Tipo de lechuga: ");
		this.setTipo(sc.next());
		System.out.print("Procedencia: ");
		this.setProcedencia(sc.next());
		System.out.print("Color: ");
		this.setColor(sc.next());
		System.out.print("Euro/Kilo: ");
		this.setEurosKilo(sc.nextDouble());
	}

	//metodo para monstrar en pantalla una lechuga

	public void mostrarLechuga(){

		System.out.println("Tipo de lechuga: " + (this.getTipo()));
		System.out.println("Procedencia: " + (this.getProcedencia()));
		System.out.println("Color: " + (this.getColor()));
		System.out.println("Precio: " + (this.getEurosKilo()) + " €/Kg");
	}
}