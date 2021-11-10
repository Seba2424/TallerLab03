public class Producto {
	private int codigoDeProducto;
	private String tipoDeProducto;
	public Flete flete= new Flete();

	public int getCodigoDeProducto() {
		return this.codigoDeProducto;
	}

	public void setCodigoDeProducto(int codigoDeProducto) {
		this.codigoDeProducto = codigoDeProducto;
	}

	public String getTipoDeProducto() {
		return this.tipoDeProducto;
	}

	public void setTipoDeProducto(String tipoDeProducto) {
		this.tipoDeProducto = tipoDeProducto;
	}
}