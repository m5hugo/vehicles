package vehicles;

public class Vehicle {
	
	private static final int velocitat_maxima = 120;
      
	private double cilindrada;
	private int portes;
	private int velocitat_actual;
	
	public void accelerar(){		
		this.velocitat_actual += 10;	
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
