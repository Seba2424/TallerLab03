public class Camion {
	private int codigoDeCamion;
	private String patente;
	private String descripcion;
	private boolean estado;
	private String[] camiones;
	private int [] codigosdecamiones={111,222,333,444,555};
	private String []patentes={"AA1122","BB2233","CC3344","DD4455","EE5566"};
	private String []descripiones={"amarillo","rojo","verde","morado","negro"};
	private boolean [] estados={true,false,true,true,false};
	public Sucursal sucursal=new Sucursal();
	public Flete flete=new Flete();

	public boolean CambiarEstadoCamion(boolean estado) {
		throw new UnsupportedOperationException();
	}

	public int getCodigoDeCamion() {
		return this.codigoDeCamion;
	}

	public void setCodigoDeCamion(int codigoDeCamion) {
		this.codigoDeCamion = codigoDeCamion;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String[] getCamiones() {
		return this.camiones;
	}

	public void setCamiones(String[] camiones) {
		this.camiones = camiones;
	}
}