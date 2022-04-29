
public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	

	public Alumno(String nom, String ap, String DNI) {
		this.nombre = nom;
		this.apellido = ap;
		this.dni = DNI;
	}
	
	public String toString() {
		return "" + this.nombre + "" + this.apellido + "" + this.dni + "."
	}
}
