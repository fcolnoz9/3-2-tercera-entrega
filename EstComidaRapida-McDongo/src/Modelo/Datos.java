package Modelo;

public class Datos {

	private String nombre;
	private String codigo;
	
	public Datos() {
		super();
	}
	
	public Datos(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
