import java.util.Scanner;

public class Sucursal {
	private int codigoSucursal;
	private String regionAsociada;
	private int []codigosSucursales={11,22,33,44,55};
	private String []regionesAsociadas={"Araucania","Metropolitana","Atacama","Antofagasta","Maule"};
	public Empresa empresa=new Empresa();
	public Camion camion=new Camion();

	public int agregarCamiones(Camion camion) {
		System.out.println("digite codigo de camion");
		Scanner entrada= new Scanner(System.in);
		int codigo= entrada.nextInt();
		for(int i=0;i>=camion.codigosdecamiones.length;i++){
			camion.codigosdecamiones[5]=codigo;
		}
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