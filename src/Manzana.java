import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Manzana extends Producto {

	private String color;
	private Double eurosKilo;
	private BufferedReader br;
	private Scanner sc = new Scanner(System.in);

	//métodos getter y setter

	public void setColor(String colorIntroducido){
		this.color = colorIntroducido;
	}

	public String getColor(){
		return this.color;
	}

	public void setEurosKilo(Double eurosKiloIntroducido){
		this.eurosKilo = eurosKiloIntroducido;
	}

	public Double getEurosKilo(){
		return this.eurosKilo;
	}
	
	//metodos para guardar una manzana
	
	public void guardarManzana() throws IOException{
		
		br = new BufferedReader(new FileReader("distribuidores.txt"));
		String linea;
		Distribuidor distribuidorObjeto = new Distribuidor();
		Direccion direccionObjeto = new Direccion();
		Contacto contactoObjeto = new Contacto();
		
		System.out.print("Tipo de manzana: ");
		this.setTipo(sc.next());
		System.out.print("Procedencia: ");
		this.setProcedencia(sc.next());
		System.out.print("Color: ");
		this.setColor(sc.next());
		System.out.print("Euro/Kilo: ");
		this.setEurosKilo(sc.nextDouble());
		System.out.print("Introduce el nombre del distribuidor: ");
		String distribuidorNombre = sc.next();
		
		while((linea = br.readLine()) != null) { 
			
			String [] palabras = linea.split(",");
			
			//System.out.print(distribuidorNombre + " = " + palabras[0] + " --> ");
			
			if (distribuidorNombre == palabras[0]){
				
				distribuidorObjeto.setNombre(palabras[0]);
		 		distribuidorObjeto.setCif(palabras[1]);
		 		direccionObjeto.setDireccion(palabras[2]);
		 		contactoObjeto.setNombre(palabras[3]);
		 		contactoObjeto.setApellido(palabras[4]);
		 		contactoObjeto.setTelefono(Integer.parseInt(palabras[5]));
		 		
				distribuidorObjeto.setDireccion(direccionObjeto);
				
				distribuidorObjeto.setPersonaContacto(contactoObjeto);
				
				this.setDistribuidor(distribuidorObjeto);
				
			} else {
				
				System.out.print("ERROR\n");
			}
		}
	}
	
	//metodo para monstrar en pantalla una manzana
	
	public void mostrarManzana(){
		
		System.out.println("Tipo de manzana: " + (this.getTipo()));
		System.out.println("Procedencia: " + (this.getProcedencia()));
		System.out.println("Color: " + (this.getColor()));
		System.out.println("Precio: " + (this.getEurosKilo()) + " €/Kg");
		System.out.println("-- DISTRIBUIDOR --");
		System.out.println("Nombre: " + (this.getDistribuidor().getNombre()));
		System.out.println("CIF: " + this.getDistribuidor().getCif());
		System.out.println("Dirección: " + this.getDistribuidor().getDireccion().getDireccion());
		System.out.println("Persona de contacto: " + this.getDistribuidor().getPersonaContacto().getNombre() + " " + this.getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + this.getDistribuidor().getPersonaContacto().getTelefono());
		System.out.print("\n");
	}
}