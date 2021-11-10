public class Sucursal {
	private int codigoSucursal;
	private String regionAsociada;
	private int []codigosSucursales={11,22,33,44,55};
	private String []regionesAsociadas={"Araucania","Metropolitana","Atacama","Antofagasta","Maule"};
	public Empresa empresa=new Empresa();
	public Camion camion=new Camion();

	public int agregarCamiones(Camion camion) {

	}

	public int quitarCamiones(Camion camion) {
		throw new UnsupportedOperationException();
	}

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getRegionAsociada() {
		return this.regionAsociada;
	}

	public void setRegionAsociada(String regionAsociada) {
		this.regionAsociada = regionAsociada;
	}
}