import java.io.IOException;
import java.util.Scanner;

public class Almacen {

	private static Scanner sc = new Scanner(System.in);

	public static void main (String args[]) throws IOException {
		
		int respuesta = 0;
		Leche lecheObjeto = new Leche();		
		Lechuga lechugaObjeto = new Lechuga();		
		Manzana manzanaObjeto = new Manzana();
		
		do {
		
			System.out.print("\n -------------------- MENU --------------------");
			System.out.print("\n|                                              |");
			System.out.print("\n|   1 - Guardar Productos                      |");
			System.out.print("\n|   2 - Mostrar Productos                      |");
			System.out.print("\n|   3 - Salir                                  |");
			System.out.print("\n|                                              |");
			System.out.print("\n ----------------------------------------------");
			System.out.print("\nElija un número de las opciones de arriba: ");		
			respuesta = Integer.parseInt(sc.next());
	
			
			switch (respuesta) {
/*----------------------------------------------------------GUARDAR PRODUCTOS------------------------------------------------------------------*/
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
						
								for (int x = 0; x < cantidad; x++)	{
									System.out.println("\nLeche nº" + (x + 1));
						
									lecheObjeto.guardarLeche();
								}
								
								break;
							}
							
							case 2: {
								
								System.out.print("\n¿Cuantas lechugas desea? ");
								int cantidad = Integer.parseInt(sc.next());
						
								for (int x = 0; x < cantidad; x++)	{
									System.out.println("\nLechuga nº" + (x + 1));
						
									lechugaObjeto.guardarLechuga();
								}
								
								break;
							}
							
							case 3: {
								
								System.out.print("\n¿Cuantas manzanas desea? ");
								int cantidad = Integer.parseInt(sc.next());
						
								for (int x = 0; x < cantidad; x++)	{
									System.out.println("\nManzana nº" + (x + 1));
						
									manzanaObjeto.guardarManzana();	
								}
								
								break;
							}
						}
					} while (respuestaProducto == 1 || respuestaProducto == 2 || respuestaProducto == 3);
					
					break;
				}
/*----------------------------------------------------------MOSTRAR PORDUCTOS------------------------------------------------------------------*/
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
								
								lecheObjeto.mostrarLeche();
								
								break;
							}
							
							case 2: {
						
								lechugaObjeto.mostrarLechuga();
								
								break;
							}
							
							case 3: {
								
								manzanaObjeto.mostrarManzana();
								
								break;
							}
						}
					} while (respuestaProducto == 1 || respuestaProducto == 2 || respuestaProducto == 3);
					
					break;
				} 
			}
		} while (respuesta == 1 || respuesta == 2);
	}
}