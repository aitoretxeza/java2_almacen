import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

	private static Scanner sc = new Scanner(System.in);
	private static BufferedReader br;

	public static void main (String args[]) throws IOException {
		
		int respuesta = 0;
		String linea;
		ArrayList<Leche> leches = new ArrayList<Leche>();
		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
		ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		do {
		
			System.out.print("\n -------------------- MENU --------------------");
			System.out.print("\n|                                              |");
			System.out.print("\n|   1 - Guardar Productos                      |");
			System.out.print("\n|   2 - Mostrar Productos                      |");
			System.out.print("\n|   3 - Distribuidores                         |");
			System.out.print("\n|   4 - Clientes                               |");
			System.out.print("\n|   5 - Cesta                                  |");
			System.out.print("\n|   6 - Salir                                  |");
			System.out.print("\n|                                              |");
			System.out.print("\n ----------------------------------------------");
			System.out.print("\nElija un número de las opciones de arriba: ");
			respuesta = Integer.parseInt(sc.next());

			switch (respuesta) {
/*----------------------------------------------------------------- GUARDAR PRODUCTOS ------------------------------------------------------------------*/
				case 1: {
					
					int respuestaProducto = 0;
					
					do {
						
						System.out.print("\n ------- INTRODUCCION DE LOS PRODUCTOS --------");
						System.out.print("\n|                                              |");
						System.out.print("\n|   1 - Leche                                  |");
						System.out.print("\n|   2 - Lechuga                                |");
						System.out.print("\n|   3 - Manzana                                |");
						System.out.print("\n|   4 - Atras                                  |");
						System.out.print("\n|                                              |");
						System.out.print("\n ----------------------------------------------");
						System.out.print("\nElija un número de las opciones de arriba: ");
						respuestaProducto = Integer.parseInt(sc.next());
						
						switch (respuestaProducto) {
						
							case 1: {
								
								System.out.print("\n¿Cuanta leche desea? ");
								int cantidad = Integer.parseInt(sc.next());

								for (int x = 0; x < cantidad; x++) {
									System.out.println("\nLeche nº" + (x + 1));	

									Leche lecheObjeto = new Leche();

									lecheObjeto.guardarLeche();
									
									leches.add(lecheObjeto);
								}
								break;
							}
							
							case 2: {
								
								System.out.print("\n¿Cuantas lechugas desea? ");
								int cantidad = Integer.parseInt(sc.next());

								for (int x = 0; x < cantidad; x++) {
									System.out.println("\nLechuga nº" + (x + 1));

									Lechuga lechugaObjeto = new Lechuga();
									
									lechugaObjeto.guardarLechuga();
									
									lechugas.add(lechugaObjeto);
								}
								
								break;
							}
							
							case 3: {
								
								System.out.print("\n¿Cuantas manzanas desea? ");
								int cantidad = Integer.parseInt(sc.next());
						
								for (int x = 0; x < cantidad; x++) {
									System.out.println("\nManzana nº" + (x + 1));
						
									Manzana manzanaObjeto = new Manzana();
									
									manzanaObjeto.guardarManzana();
									
									manzanas.add(manzanaObjeto);
								}
								
								break;
							}
						}
					} while (respuestaProducto >= 1 && respuestaProducto <= 3);
					
					break;
				}
/*----------------------------------------------------------------- MOSTRAR PRODUCTOS ------------------------------------------------------------------*/
				case 2: {
					
					int respuestaProducto = 0;
					
					do {
						
						System.out.print("\n ----------- LISTA DE LOS PRODUCTOS -----------");
						System.out.print("\n|                                              |");
						System.out.print("\n|   1 - Leche                                  |");
						System.out.print("\n|   2 - Lechuga                                |");
						System.out.print("\n|   3 - Manzana                                |");
						System.out.print("\n|   4 - Atras                                  |");
						System.out.print("\n|                                              |");
						System.out.print("\n ----------------------------------------------");
						System.out.print("\nElija un número de las opciones de arriba: ");
						respuestaProducto = Integer.parseInt(sc.next());
						
						switch (respuestaProducto) {
						
							case 1: {
								
								for(int x = 0; x < leches.size(); x++) {
								
									leches.get(x).mostrarLeche();
								}
								
								break;
							}
							
							case 2: {
								
								for(int x = 0; x < lechugas.size(); x++) {
								
									lechugas.get(x).mostrarLechuga();
								}
								
								break;
							}
							
							case 3: {

								for(int x = 0; x < manzanas.size(); x++) {
								
									manzanas.get(x).mostrarManzana();
								}
								
								break;
							}
						}
					} while (respuestaProducto >= 1 && respuestaProducto <= 3);
					
					break;
				}
/*------------------------------------------------------------------- DISTRIBUIDORES -------------------------------------------------------------------*/
				case 3: {
					br = new BufferedReader(new FileReader("distribuidores.txt"));
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
					}
					break;
				}
/*---------------------------------------------------------------------- CLIENTES ----------------------------------------------------------------------*/
				case 4: {
					br = new BufferedReader(new FileReader("clientes.txt"));		
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
					}
					break;
				}
/*----------------------------------------------------------------------- CESTA ------------------------------------------------------------------------*/
				case 5: {
					Double numSocio;
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

					System.out.println("\nINFROMACIÓN DE LOS PRODUCTOS");
					
					if (leches.size() != 0) {
						System.out.println("\nLECHES");
						for(int x = 0; x < leches.size(); x++) {
							
							leches.get(x).mostrarLeche();
						}
					}
					
					if (lechugas.size() != 0) {
						System.out.println("\nLECHUGAS");
						for(int x = 0; x < lechugas.size(); x++) {
							
							lechugas.get(x).mostrarLechuga();
						}
					}
					
					if (manzanas.size() != 0) {
						System.out.println("\nMANZANAS");
						for(int x = 0; x < manzanas.size(); x++) {
							
							manzanas.get(x).mostrarManzana();
						}
					}
					
					cestaObjeto.setLeches(leches);
					cestaObjeto.setLechugas(lechugas);
					cestaObjeto.setManzanas(manzanas);

					System.out.println("\nImporte total con el descuento (" + clienteObjeto2.getDto() + " %) añadido: " + cestaObjeto.importeCompra() + " €");
					break;
				}
/*------------------------------------------------------------------------------------------------------------------------------------------------------*/
			}
		} while (respuesta >= 1 && respuesta <= 5);
	}
}