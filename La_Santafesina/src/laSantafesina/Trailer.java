package laSantafesina;

public class Trailer extends Transporte{
	private boolean frigorifico;
	private double segCarga;
	
	public Trailer() {}
	
	public Trailer(String id, double cargaMax, double capacidad, double costoKm, boolean frigorifico, double segCarga) {
		super(id, cargaMax, capacidad, costoKm);
		this.frigorifico = frigorifico;
		this.segCarga = segCarga;
	}
}
