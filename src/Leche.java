public class Leche extends Producto {

	private Double eurosLitro;

	//métodos getter y setter

	public void setEurosLitro(Double eurosLitroIntroducido){
		this.eurosLitro = eurosLitroIntroducido;
	}

	public Double getEurosLitro(){
		return this.eurosLitro;
	}

	//metodos para guardar una leche

	public void guardarLeche(){

		System.out.print("Tipo de leche: ");
		this.setTipo(sc.next());
		System.out.print("Procedencia: ");
		this.setProcedencia(sc.next());
		System.out.print("Color: ");
		this.setColor(sc.next());
		System.out.print("Euro/Kilo: ");
		this.setEurosKilo(sc.nextDouble());
	}

	//metodo para monstrar en pantalla una leche

	public void mostrarLeche(){

		System.out.println("Tipo de leche: " + (this.getTipo()));
		System.out.println("Procedencia: " + (this.getProcedencia()));
		System.out.println("Color: " + (this.getColor()));
		System.out.println("Precio: " + (this.getEurosKilo()) + " €/Kg");
	}
}