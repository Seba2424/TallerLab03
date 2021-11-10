public class Flete {
	private int codigoDeFlete;
	private String descripcionDeFlete;
	private int cantidadProductos;
	public Camion camion=new Camion();
	public Producto producto=new Producto();

	public int agregarProducto(Producto producto) {
		throw new UnsupportedOperationException();
	}

	public int quitarProducto(Producto producto) {
		throw new UnsupportedOperationException();
	}

	public double calcularValorFlete(int cantidadProducto) {
		throw new UnsupportedOperationException();
	}

	public int getCodigoDeFlete() {
		return this.codigoDeFlete;
	}

	public void setCodigoDeFlete(int codigoDeFlete) {
		this.codigoDeFlete = codigoDeFlete;
	}

	public String getDescripcionDeFlete() {
		return this.descripcionDeFlete;
	}

	public void setDescripcionDeFlete(String descripcionDeFlete) {
		this.descripcionDeFlete = descripcionDeFlete;
	}

	public int getCantidadProductos() {
		return this.cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
}