package laSantafesina;

public class Transporte {
	private String idTrans;
	private double cargaMax;
	private double capacidad;
	private double costoKm;
	
	public Transporte() {}
	
	public Transporte(String id, double cargaMax2, double capacidad2, double costoKm2) {
	}
	
	public String getIdTrans() {
		return idTrans;
	}
	public void setIdTrans(String idTrans) {
		this.idTrans = idTrans;
	}
	public double getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public double getCostoKm() {
		return costoKm;
	}
	public void setCostoKm(double costoKm) {
		this.costoKm = costoKm;
	}
	
	@Override
	public String toString() {
		return "Transporte [idTrans=" + idTrans + ", cargaMax=" + cargaMax + ", capacidad=" + capacidad + ", costoKm="
				+ costoKm + "]";
	}

}
