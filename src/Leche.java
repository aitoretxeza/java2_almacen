import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Leche extends Producto {

	private Double eurosLitro;
	private BufferedReader br;
	private Scanner sc = new Scanner(System.in);

	//métodos getter y setter

	public void setEurosLitro(Double eurosLitroIntroducido){
		this.eurosLitro = eurosLitroIntroducido;
	}

	public Double getEurosLitro(){
		return this.eurosLitro;
	}

	//metodos para guardar una leche

	public void guardarLeche() throws IOException {
		
		br = new BufferedReader(new FileReader("distribuidores.txt"));
		String linea;
		Distribuidor distribuidorObjeto = new Distribuidor();
		Direccion direccionObjeto = new Direccion();
		Contacto contactoObjeto = new Contacto();

		System.out.print("Tipo de leche: ");
		this.setTipo(sc.next());
		System.out.print("Procedencia: ");
		this.setProcedencia(sc.next());
		System.out.print("Precio (€/l): ");
		this.setEurosLitro(sc.nextDouble());
		System.out.print("Introduce el nombre del distribuidor: ");
		String distribuidorNombre = sc.next();
		System.out.print("\n");
		
		while((linea = br.readLine()) != null) { 
			
			String [] palabras = linea.split(",");
			
			if (distribuidorNombre.equalsIgnoreCase(palabras[0])){
				
				distribuidorObjeto.setNombre(palabras[0]);
		 		distribuidorObjeto.setCif(palabras[1]);
		 		direccionObjeto.setDireccion(palabras[2]);
		 		contactoObjeto.setNombre(palabras[3]);
		 		contactoObjeto.setApellido(palabras[4]);
		 		contactoObjeto.setTelefono(Integer.parseInt(palabras[5]));
		 		
				distribuidorObjeto.setDireccion(direccionObjeto);
				
				distribuidorObjeto.setPersonaContacto(contactoObjeto);
				
				this.setDistribuidor(distribuidorObjeto);
				
			}
		}
	}
	
	//metodo para monstrar en pantalla una leche

	public void mostrarLeche(){

		System.out.println("Tipo de leche: " + (this.getTipo()));
		System.out.println("Procedencia: " + (this.getProcedencia()));
		System.out.println("Precio: " + (this.getEurosLitro()) + " €/l");
		System.out.println("-- DISTRIBUIDOR --");
		System.out.println("Nombre: " + (this.getDistribuidor().getNombre()));
		System.out.println("CIF: " + this.getDistribuidor().getCif());
		System.out.println("Dirección: " + this.getDistribuidor().getDireccion().getDireccion());
		System.out.println("Persona de contacto: " + this.getDistribuidor().getPersonaContacto().getNombre() + " " + this.getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + this.getDistribuidor().getPersonaContacto().getTelefono());
		System.out.print("\n");
	}
}