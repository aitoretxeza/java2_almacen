import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	public static void main (String args[]) throws IOException {

		FileReader frDistribuidores = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(frDistribuidores); 
		String [] palabras = null;
		String s;
		ArrayList <Distribuidor> distribuidores = new ArrayList <Distribuidor> ();		
		while((s = br.readLine()) != null) { 

			Distribuidor distribuidorObjeto = new Distribuidor();
			Direccion direccionObjeto = new Direccion();
			Contacto contactoObjeto = new Contacto();	
			
			palabras = s.split(",");
		    
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
		}

       	FileReader frClientes = new FileReader("clientes.txt");
		br = new BufferedReader(frClientes);
		palabras = null;
		ArrayList <Cliente> clientes = new ArrayList <Cliente> ();		
		while((s = br.readLine()) != null) {

			Cliente clienteObjeto = new Cliente();
			Direccion direccionObjeto = new Direccion();

			palabras = s.split(", ");

			clienteObjeto.setNombre(palabras[0]);
			clienteObjeto.setApellidos(palabras[1]);
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
			System.out.println("Apellidos: " + clientes.get(x).getApellidos());
			System.out.println("Dirección: " + clientes.get(x).getDireccion().getDireccion());
			System.out.println("Número de socio: " + clientes.get(x).getNumeroSocio());
			System.out.println("Descuento: " + clientes.get(x).getDto() + "% \n");
		}

		Scanner sc = new Scanner(System.in);	
		System.out.println("\nINTRODUCCION DE LOS PRODUCTOS\n");
		String cadena = "";
		
		ArrayList <Manzana> manzanas = new ArrayList <Manzana>();
		for (int x = 0; x < 2; x++)	{

			Manzana manzanaObjeto = new Manzana();

			System.out.println("Manzana nº" + (x + 1));
			System.out.print("Tipo de manzana: ");
			manzanaObjeto.setTipoManzana(sc.next());
			System.out.print("Procedencia: ");
			manzanaObjeto.setProcedencia(sc.next());
			System.out.print("Color: ");
			manzanaObjeto.setColor(sc.next());
			System.out.print("Euro/Kilo: ");
			manzanaObjeto.setEurosKilo(sc.nextDouble());
			System.out.print("Introduce el nombre del distribuidor: ");
			cadena = sc.next();
			System.out.print("\n");

			for(int i = 0; i < distribuidores.size(); i++) {
				if (cadena.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzanaObjeto.setDistribuidor(distribuidores.get(i));
				}
			}
			manzanas.add(manzanaObjeto);			
		}
		
		ArrayList <Lechuga> lechugas = new ArrayList <Lechuga>();
		System.out.println("Lechuga nº1");
		Lechuga lechugaObjeto = new Lechuga();
		System.out.print("Tipo de lechuga: ");
		lechugaObjeto.setTipoLechuga(sc.next());
		System.out.print("Procedencia: ");
		lechugaObjeto.setProcedencia(sc.next());
		System.out.print("Color: ");
		lechugaObjeto.setColor(sc.next());
		System.out.print("Euro/Unidad: ");
		lechugaObjeto.setEurosUnidad(sc.nextDouble());	
		System.out.print("Introduce el nombre del distribuidor: ");
		cadena = sc.next();
		System.out.print("\n");

		for(int i = 0; i < distribuidores.size(); i++) {
			if (cadena.equalsIgnoreCase(distribuidores.get(i).getNombre())){
				lechugaObjeto.setDistribuidor(distribuidores.get(i));
			}
		}
		lechugas.add(lechugaObjeto);
		
		//leche
		ArrayList <Leche> leches = new ArrayList <Leche>();
		for (int x = 0; x < 2; x++) {
			System.out.println("Leche nº" + (x + 1));
			Leche lecheObjeto = new Leche();
			System.out.print("Tipo de leche: ");
			lecheObjeto.setTipo(sc.next());
			System.out.print("Procedencia: ");
			lecheObjeto.setProcedencia(sc.next());
			System.out.print("Euro/Litro: ");
			lecheObjeto.setEurosLitro(sc.nextDouble());
			System.out.print("Introduce el nombre del distribuidor: ");
			cadena = sc.next();
			System.out.print("\n");

			for(int i = 0; i < distribuidores.size(); i++) {
				if (cadena.equalsIgnoreCase(distribuidores.get(i).getNombre())){
					lecheObjeto.setDistribuidor(distribuidores.get(i));
				}
			}
			leches.add(lecheObjeto);	
		}

		System.out.println("\n INFROMACIÓN DE LOS PRODUCTOS \n");
		System.out.println("MANZANAS \n");
		for(int j = 0; j < manzanas.size(); j++) {
			System.out.println("Manzana nº" + (j + 1));
			System.out.println("Tipo de manzana: " + (manzanas.get(j).getTipoManzana()));
			System.out.println("Procedencia: " + (manzanas.get(j).getProcedencia()));
			System.out.println("Color: " + (manzanas.get(j).getColor()));
			System.out.println("Euro/Kilo: " + (manzanas.get(j).getEurosKilo()) + "€");
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
			System.out.println("Tipo de lechuga: " + (lechugas.get(j).getTipoLechuga()));
			System.out.println("Procedencia: " + (lechugas.get(j).getProcedencia()));
			System.out.println("Color: " + (lechugas.get(j).getColor()));
			System.out.println("Euro/Unidad: " + (lechugas.get(j).getEurosUnidad()) + "€");
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
			System.out.println("Euro/Litro: " + (leches.get(j).getEurosLitro()) + "€");
			System.out.println("-- DISTRIBUIDOR --");
			System.out.println("Nombre: " + (leches.get(j).getDistribuidor().getNombre()));
			System.out.println("CIF: " + leches.get(j).getDistribuidor().getCif());
			System.out.println("Dirección: " + leches.get(j).getDistribuidor().getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + leches.get(j).getDistribuidor().getPersonaContacto().getNombre() + " " + leches.get(j).getDistribuidor().getPersonaContacto().getApellido() + ", tlf.: " + leches.get(j).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.print("\n");
		}
	}
}	
