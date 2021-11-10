public class Empresa {
	private String nombreComercial;
	private String direccion;
	private String []nombresComerciales={"chileexpress","correosdechile","starken","fendex","dhl"};
	private String [] direcciones={"callefalsa1","callefalsa2","callefalsa3","callefalsa4","callefalsa5"};
	public Sucursal sucursal=new Sucursal();

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}