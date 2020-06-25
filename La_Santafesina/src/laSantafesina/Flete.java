package laSantafesina;

public class Flete extends Transporte{
	private int acompa�ante;
	private double costoPorAcom;
	
	public Flete() {}
	
	public Flete(String id, double cargaMax, double capacidad, double costoKm, int acompa�ante, double costoPorAcom) {
		super(id, cargaMax, capacidad, costoKm);
		this.acompa�ante = acompa�ante;
		this.costoPorAcom = costoPorAcom;
	}
}
