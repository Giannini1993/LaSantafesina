package laSantafesina;

public class Flete extends Transporte{
	private int acompañante;
	private double costoPorAcom;
	
	public Flete() {}
	
	public Flete(String id, double cargaMax, double capacidad, double costoKm, int acompañante, double costoPorAcom) {
		super(id, cargaMax, capacidad, costoKm);
		this.acompañante = acompañante;
		this.costoPorAcom = costoPorAcom;
	}
}
