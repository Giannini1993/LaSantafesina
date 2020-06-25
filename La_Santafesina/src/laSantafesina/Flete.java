package laSantafesina;

public class Flete extends Transporte{
	private int acompaņante;
	private double costoPorAcom;
	
	public Flete() {}
	
	public Flete(String id, double cargaMax, double capacidad, double costoKm, int acompaņante, double costoPorAcom) {
		super(id, cargaMax, capacidad, costoKm);
		this.acompaņante = acompaņante;
		this.costoPorAcom = costoPorAcom;
	}
}
