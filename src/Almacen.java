import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	public static void main (String args[]) throws IOException {

		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr); 
		String [] campos = null;
		System.out.println("\nDISTRIBUIDORES\n");
		String s;
		ArrayList <Distribuidor> distribuidores = new ArrayList <Distribuidor> ();		
		while((s = br.readLine()) != null) { 

			Distribuidor distribuidorObjeto = new Distribuidor();
			Direccion direccionObjeto = new Direccion();
			Contacto contactoObjeto = new Contacto();	
			
			campos = s.split(",");
		    
	 		distribuidorObjeto.setNombre(campos[0]);
	 		distribuidorObjeto.setCif(campos[1]);
	 		direccionObjeto.setDireccion(campos[2]);
	 		contactoObjeto.setNombre(campos[3]);
	 		contactoObjeto.setApellido(campos[4]);
	 		contactoObjeto.setTelefono(Integer.parseInt(campos[5]));
			distribuidorObjeto.setDireccion(direccionObjeto);
			distribuidorObjeto.setPersonaContacto(contactoObjeto);
			distribuidores.add(distribuidorObjeto);
		}

		for(int x = 0; x < distribuidores.size(); x++){
			System.out.println("Nombre: " + distribuidores.get(x).getNombre());
			System.out.println("C.I.F.: " + distribuidores.get(x).getCif());
			System.out.println("Direccion: " + distribuidores.get(x).getDireccion().getDireccion());
			System.out.println("Persona de contacto: " + distribuidores.get(x).getPersonaContacto().getNombre() + " " + distribuidores.get(x).getPersonaContacto().getApellido() + ", tlf.: " + distribuidores.get(x).getPersonaContacto().getTelefono() + "\n");
       	}   


		Scanner sc = new Scanner(System.in);	
		System.out.println("\nPRODUCTOS\n");
		String cadena = "";
		
		//manzana
		ArrayList <Manzana> manzanas = new ArrayList <Manzana>();
		for (int m = 0; m < 2; m++)	{

			Manzana manzanaObjeto = new Manzana();

			System.out.println("Manzana " + (m + 1));
			System.out.print("Tipo de manzana:");
			manzanaObjeto.setTipoManzana(sc.next());
			System.out.print("Procedencia:");
			manzanaObjeto.setProcedencia(sc.next());
			System.out.print("Color:");
			manzanaObjeto.setColor(sc.next());
			System.out.print("Euro/Kilo:");
			manzanaObjeto.setEurosKilo(sc.nextDouble());
			System.out.print("Introduce el nombre del distribuidor:");
			cadena = sc.next();			
			System.out.print("\n");

			for(int j = 0; j < distribuidores.size(); j++) {
				if (cadena.equalsIgnoreCase(distribuidores.get(j).getNombre())) {
					manzanaObjeto.setDistribuidor(distribuidores.get(j));
				}
			}
			manzanas.add(manzanaObjeto);			
		}
		
		//lechuga
		ArrayList <Lechuga> lechugas = new ArrayList <Lechuga>();
		System.out.println("Lechuga");
		/*
		String tipoLechuga, procedencia, color;
		Double eurosUnidad;
		Distribuidor distribuidor;
		*/
		Lechuga lechu = new Lechuga();
		System.out.println("\n		tipo de lechuga:");
		lechu.setTipoLechuga(sc.next());
		System.out.println("\n		procedencia:");
		lechu.setProcedencia(sc.next());
		System.out.println("\n		color:");
		lechu.setColor(sc.next());
		System.out.println("\n		euro/unidad:");
		lechu.setEurosUnidad(sc.nextDouble());	
		System.out.println("\n	Introduce el nombre del distribuidor:");
		cadena = sc.next();
		//recorremos el ArrayList de distribuidores para buscar el introducido
		for(int j=0; j<distribuidores.size(); j++) {
			//si lo encontramos
			if (cadena.equalsIgnoreCase(distribuidores.get(j).getNombre())){
				//le asignamos el valor del distribuidor al objeto leche
				lechu.setDistribuidor(distribuidores.get(j));
			}
		}
		//añadimos la manzana al ArrayList
		lechugas.add(lechu);
		
		//leche
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		for (int l=0; l<2; l++)
		{
			System.out.println("\n	leche"+(l+1)+":");
			/*
    		String tipo, procedencia;
			Double eurosLitro;
			Distribuidor distribuidor;
			*/
			Leche lec = new Leche();
			//lec.setTipo(sc.next());
			System.out.println("\n		tipo de leche:");
			lec.setTipo(sc.next());
			System.out.println("\n		procedencia:");
			lec.setProcedencia(sc.next());
			System.out.println("\n		euro/litro:");
			lec.setEurosLitro(sc.nextDouble());
			System.out.println("\n	Introduce el nombre del distribuidor:");
			cadena = sc.next();
			//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int j=0; j<distribuidores.size(); j++)
			{
				//si lo encontramos
				if (cadena.equalsIgnoreCase(distribuidores.get(j).getNombre())){
					//le asignamos el valor del distribuidor al objeto leche
					lec.setDistribuidor(distribuidores.get(j));
				}
			}
			//añadimos la leche al ArrayList
			al_leche.add(lec);	
		}
		
		//visualizacion de los productos
		//manzana,lechuga y leche
		System.out.println("****Manzana****");
			/*
			String tipoManzana, procedencia, color, 
			Double eurosKilo;
			Distribuidor distribuidor;
			*/
		for(int i = 0;i<manzanas.size();i++)	{
			System.out.println("Tipo de manzana: "+(manzanas.get(i).getTipoManzana()));
			System.out.println("Prcedencia: "+(manzanas.get(i).getProcedencia()));
			System.out.println("Color: "+(manzanas.get(i).getColor()));
			System.out.println("euro/Kg: "+(manzanas.get(i).getEurosKilo()));
			System.out.println("***DISTRIBUIDOR***");
			    /*
			    String nombre,	cif;
				Direccion direccion;
					String direccion;
				Contacto personaContacto;
				    String nombre, apellido;
					int telefono;   
				*/
			System.out.println("DISTRIBUIDOR: "+(manzanas.get(i).getDistribuidor().getNombre()));
			System.out.println("cif:" + manzanas.get(i).getDistribuidor().getCif());
			System.out.println("DIRECCION:" + manzanas.get(i).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + manzanas.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + manzanas.get(i).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + manzanas.get(i).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		System.out.println("****Lechuga****");
			/*
			String tipoLechuga, procedencia, color;
			Double eurosUnidad;
			Distribuidor distribuidor;
			*/
		for(int i = 0;i<lechugas.size();i++)	{
			System.out.println("Tipo de lechuga: "+(lechugas.get(i).getTipoLechuga()));
			System.out.println("Prcedencia: "+(lechugas.get(i).getProcedencia()));
			System.out.println("Color: "+(lechugas.get(i).getColor()));
			System.out.println("euro/Unidad: "+(lechugas.get(i).getEurosUnidad()));
			System.out.println("***DISTRIBUIDOR***");
			    /*
			    String nombre,	cif;
				Direccion direccion;
					String direccion;
				Contacto personaContacto;
				    String nombre, apellido;
					int telefono;   
				*/
			System.out.println("DISTRIBUIDOR: "+(lechugas.get(i).getDistribuidor().getNombre()));
			System.out.println("cif:" + lechugas.get(i).getDistribuidor().getCif());
			System.out.println("DIRECCION:" + lechugas.get(i).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + lechugas.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + lechugas.get(i).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		System.out.println("****Leche****");
			/*
    		String tipo, procedencia;
			Double eurosLitro;
			Distribuidor distribuidor;
			*/
		for(int i = 0;i<al_leche.size();i++)	{
			System.out.println("Tipo de leche: "+(al_leche.get(i).getTipo()));
			System.out.println("Prcedencia: "+(al_leche.get(i).getProcedencia()));
			System.out.println("euro/litro: "+(al_leche.get(i).getEurosLitro()));
			System.out.println("***DISTRIBUIDOR***");
			    /*
			    String nombre,	cif;
				Direccion direccion;
					String direccion;
				Contacto personaContacto;
				    String nombre, apellido;
					int telefono;   
				*/
			System.out.println("DISTRIBUIDOR: "+(al_leche.get(i).getDistribuidor().getNombre()));
			System.out.println("cif:" + al_leche.get(i).getDistribuidor().getCif());
			System.out.println("DIRECCION:" + al_leche.get(i).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_leche.get(i).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
    
		// Vaciar los ArrayList
		distribuidores.clear();
		al_leche.clear();
		al_lechuga.clear();
		manzanas.clear();
	}
}	
