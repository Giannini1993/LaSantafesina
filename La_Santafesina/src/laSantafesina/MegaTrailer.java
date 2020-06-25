package laSantafesina;

public class MegaTrailer extends Trailer{
	private double costoFijo;
	private double comida;
	
	public MegaTrailer() {}
	
	public MegaTrailer(String id, double cargaMax, double capacidad, double costoKm, boolean frigorifico, double segCarga) {
		super(id, cargaMax, capacidad, costoKm, frigorifico, segCarga);
		this.costoFijo = costoFijo;
		this.comida = comida;
	}
}
