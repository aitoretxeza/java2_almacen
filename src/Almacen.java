import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	private static BufferedReader br;
	private static Scanner sc;

	public static void main (String args[]) throws IOException {		

		/*String linea;
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor> ();
		ArrayList<Cliente> clientes = new ArrayList<Cliente> ();*/
/*--------------------------------------------------------DISTRIBUIDORES---------------------------------------------------------------*/

		/*br = new BufferedReader(new FileReader("distribuidores.txt"));
		while((linea = br.readLine()) != null) { 

			Distribuidor distribuidorObjeto = new Distribuidor();
			Direccion direccionObjeto = new Direccion();
			Contacto contactoObjeto = new Contacto();	
			
			String [] palabras = linea.split(",");
		    
	 		distribuidorObjeto.setNombre(palabras[0]);
	 		distribuidorObjeto.setCif(palabras[1]);
	 		direccionObjeto.setDireccion(palabras[2]);
	 		contactoObjeto.setNombre(palabras[3]);
	 		contactoObjeto.setApellido(palabras[4]);
	 		contactoObjeto.setTelefono(Integer.parseInt(palabras[5]));
			distribuidorObjeto.setDireccion(direccionObjeto);
			distribuidorObjeto.setPersonaContacto(contactoObjeto);
			
			distribuidores.add(distribuidorObjeto);
		}

		System.out.println("\nDISTRIBUIDORES\n");
		for(int x = 0; x < distribuidores.size(); x++){
			System.out.println("Nombre: " + distribuidores.get(x).getNombre());
			System.out.println("CIF: " + distribuidores.get(x).getCif());
			System.out.println("Dirección: " + distribuidores.get(x).getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + distribuidores.get(x).getPersonaContacto().getNombre() + " " + distribuidores.get(x).getPersonaContacto().getApellido() + ", tlf.: " + distribuidores.get(x).getPersonaContacto().getTelefono() + "\n");
		}*/

/*----------------------------------------------------------CLIENTES------------------------------------------------------------------*/

		/*br = new BufferedReader(new FileReader("clientes.txt"));		
		while((linea = br.readLine()) != null) {

			Cliente clienteObjeto = new Cliente();
			Direccion direccionObjeto = new Direccion();

			String [] palabras = linea.split(", ");

			clienteObjeto.setNombre(palabras[0]);
			clienteObjeto.setApellido(palabras[1]);
			clienteObjeto.setDni(palabras[2]);			
	 		direccionObjeto.setDireccion(palabras[3]);
			clienteObjeto.setNumeroSocio(Double.parseDouble(palabras[4]));
			clienteObjeto.setDto(Double.parseDouble(palabras[5]));
			clienteObjeto.setDireccion(direccionObjeto);

			clientes.add(clienteObjeto);
		}

		System.out.println("\nCLIENTES\n");
		for(int x = 0; x < clientes.size(); x++){			
			System.out.println("DNI: " + clientes.get(x).getDni());
			System.out.println("Nombre: " + clientes.get(x).getNombre());
			System.out.println("Apellidos: " + clientes.get(x).getApellido());
			System.out.println("Dirección: " + clientes.get(x).getDireccion().getDireccion());
			System.out.println("Número de socio: " + clientes.get(x).getNumeroSocio());
			System.out.println("Descuento: " + clientes.get(x).getDto() + "%\n");
		}*/

/*----------------------------------------------------------PRODUCTOS------------------------------------------------------------------*/

		sc = new Scanner(System.in);
		System.out.println("\nINTRODUCCION DE LOS DATOS DE LOS PRODUCTOS\n");

		System.out.print("¿Cuantas clases de manzana desea? ");
		int cantidad = sc.next();

		for (int x = 0; x < cantidad; x++)	{
			System.out.println("Manzana nº" + (x + 1));

			Manzana manzanaObjeto = new Manzana();

			manzanaObjeto.guardarManzana();

			manzanaObjeto.mostrarManzana();
		}

		System.out.print("¿Cuantas clases de lechuga desea? ");
		cantidad = sc.next();

		for (int x = 0; x < cantidad; x++)	{
			System.out.println("Lechuga nº" + (x + 1));

			Lechuga lechugaObjeto = new Lechuga();

			lechugaObjeto.guardarLechuga();

			lechugaObjeto.mostrarLechuga();
		}

		System.out.print("¿Cuantas clases de leche desea? ");
		cantidad = sc.next();

		for (int x = 0; x < cantidad; x++)	{
			System.out.println("Leche nº" + (x + 1));

			Leche lecheObjeto = new Leche();

			lecheObjeto.guardarLeche();

			lecheObjeto.mostrarLeche();
		}

/*------------------------------------------------------------CESTA--------------------------------------------------------------------*/

		/*Double numSocio;
		Cesta cestaObjeto = new Cesta();		

		System.out.print("Introduzca el número de socio: ");
		numSocio = sc.nextDouble();

		br = new BufferedReader(new FileReader("clientes.txt"));
		Cliente clienteObjeto2 = new Cliente();
		while((linea = br.readLine()) != null) {

			Direccion direccionObjeto2 = new Direccion();

			String [] palabras = linea.split(", ");

			if (numSocio == Double.parseDouble(palabras[4])) {

				System.out.println("\nDNI: " + palabras[2]);
				clienteObjeto2.setDni(palabras[2]);
				System.out.println("Nombre: " + palabras[0]);
				clienteObjeto2.setNombre(palabras[0]);
				System.out.println("Apellidos: " + palabras[1]);
				clienteObjeto2.setApellido(palabras[1]);
		 		System.out.println("Dirección: " + palabras[3]);
		 		direccionObjeto2.setDireccion(palabras[3]);
		 		clienteObjeto2.setDireccion(direccionObjeto2);
		 		clienteObjeto2.setNumeroSocio(Double.parseDouble(palabras[4]));
				System.out.println("Descuento: " + Double.parseDouble(palabras[5]) + "\n");
				clienteObjeto2.setDto(Double.parseDouble(palabras[5]));


				cestaObjeto.setCliente(clienteObjeto2);
			}
		}

		System.out.println("\n INFROMACIÓN DE LOS PRODUCTOS \n");
		System.out.println("MANZANAS \n");
		for(int j = 0; j < manzanas.size(); j++) {
			System.out.println("Manzana nº" + (j + 1));
			System.out.println("Tipo de manzana: " + (manzanas.get(j).getTipo()));
			System.out.println("Procedencia: " + (manzanas.get(j).getProcedencia()));
			System.out.println("Color: " + (manzanas.get(j).getColor()));
			System.out.println("Euro/Kilo: " + (manzanas.get(j).getEurosKilo()) + " €/Kg");
			System.out.println("-- DISTRIBUIDOR --");
			System.out.println("Nombre: " + (manzanas.get(j).getDistribuidor().getNombre()));
			System.out.println("CIF: " + manzanas.get(j).getDistribuidor().getCif());
			System.out.println("Dirección: " + manzanas.get(j).getDistribuidor().getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + manzanas.get(j).getDistribuidor().getPersonaContacto().getNombre() + " " + manzanas.get(j).getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + manzanas.get(j).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.print("\n");
		}

		System.out.println("LECHUGAS \n");
		for(int j = 0; j < lechugas.size(); j++) {
			System.out.println("Lechuga nº" + (j + 1));
			System.out.println("Tipo de lechuga: " + (lechugas.get(j).getTipo()));
			System.out.println("Procedencia: " + (lechugas.get(j).getProcedencia()));
			System.out.println("Color: " + (lechugas.get(j).getColor()));
			System.out.println("Euro/Unidad: " + (lechugas.get(j).getEurosUnidad()) + " €/U");
			System.out.println("-- DISTRIBUIDOR --");
			System.out.println("Nombre: " + (lechugas.get(j).getDistribuidor().getNombre()));
			System.out.println("CIF: " + lechugas.get(j).getDistribuidor().getCif());
			System.out.println("Dirección: " + lechugas.get(j).getDistribuidor().getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + lechugas.get(j).getDistribuidor().getPersonaContacto().getNombre() + " " + lechugas.get(j).getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + lechugas.get(j).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.print("\n");
		}

		System.out.println("LECHES \n");
		for(int j = 0; j < leches.size(); j++) {
			System.out.println("Leche nº" + (j + 1));
			System.out.println("Tipo de leche: " + (leches.get(j).getTipo()));
			System.out.println("Procedencia: " + (leches.get(j).getProcedencia()));
			System.out.println("Euro/Litro: " + (leches.get(j).getEurosLitro()) + " €/l");
			System.out.println("-- DISTRIBUIDOR --");
			System.out.println("Nombre: " + (leches.get(j).getDistribuidor().getNombre()));
			System.out.println("CIF: " + leches.get(j).getDistribuidor().getCif());
			System.out.println("Dirección: " + leches.get(j).getDistribuidor().getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + leches.get(j).getDistribuidor().getPersonaContacto().getNombre() + " " + leches.get(j).getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + leches.get(j).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.print("\n");
		}

		cestaObjeto.setLeches(leches);
		cestaObjeto.setLechugas(lechugas);
		cestaObjeto.setManzanas(manzanas);

		System.out.println("Importe total con el descuento (" + clienteObjeto2.getDto() + " %) añadido: " + cestaObjeto.importeCompra() + " €");*/
	}
}