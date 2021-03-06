package vehicles;

public class Vehicle {
	
	private static final int velocitat_maxima = 120;
	private static final int marxes = 5;
      
	private double cilindrada;
	private int portes;
	private int velocitat_actual;
	private int marxaActual;
	
	public Vehicle(){
		this.velocitat_actual = 0;
	}
	
	public void pujaMarxa(){
		if (this.marxaActual < marxes) this.marxaActual += 1;
	}
	
	public void baixaMarxa(){
		if (this.marxaActual > 0) this.marxaActual -= 1;
	}
	
	public void accelerar(){		
		if (this.velocitat_actual < velocitat_maxima) this.velocitat_actual += 10;	
	}

	public void desaccelerar(){		
		if (this.velocitat_actual > 0) this.velocitat_actual -= 10;	
	}
	
	public double getCilindrada() {
		return this.cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPortes() {
		return this.portes;
	}

	public void setPortes(int portes) {
		this.portes = portes;
	}
}
