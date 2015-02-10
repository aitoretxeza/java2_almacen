import java.util.ArrayList;

public class Cesta {

	private String propiedades;
	private Cliente cliente;
	private ArrayList<Leche> leches = new ArrayList<Leche>();
	private ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
	private ArrayList<Manzana> manzanas = new ArrayList<Manzana>();

	//métodos getter y setter

	public void setPropiedades (String propiedadesIntroducido){
		this.propiedades = propiedadesIntroducido;
	}

	public String getPropiedades(){
		return this.propiedades;
	}
	public void setCliente (Cliente clienteIntroducido){
		this.cliente = clienteIntroducido;
	}

	public Cliente getCliente(){
		return this.cliente;
	}

	public void setLeches (ArrayList<Leche> lechesIntroducido){
		this.leches = lechesIntroducido;
	}
		
	public ArrayList<Leche> getLeches(){
		return this.leches;
	}

	public void setLechugas (ArrayList<Lechuga> lechugasIntroducido){
		this.lechugas = lechugasIntroducido;
	}
		
	public ArrayList<Lechuga> getLechugas(){
		return this.lechugas;
	}

	public void setManzanas (ArrayList<Manzana> manzanasIntroducido){
		this.manzanas = manzanasIntroducido;
	}
		
	public ArrayList<Manzana> getManzanas(){
		return this.manzanas;
	}

	public double importeCompra(){

		double importeLeche = 0, importeLechuga = 0, importeManzana = 0, importeTotal = 0, resultado;

		for (int x = 0; x < this.leches.size(); x++){
			importeLeche = importeLeche + leches.get(x).getEurosLitro();
		}

		for (int x = 0; x < this.lechugas.size(); x++){
			importeLechuga = importeLechuga + lechugas.get(x).getEurosUnidad();
		}

		for (int x = 0; x < this.manzanas.size(); x++){
			importeManzana = importeManzana + manzanas.get(x).getEurosKilo();
		}
		
		importeTotal = importeLeche + importeLechuga + importeManzana;

		resultado = (importeTotal) - ((cliente.getDto() * (importeTotal)) / 100);
		
		return resultado;
 	}
}