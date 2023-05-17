package clases;

public class profesores extends Persona {
public String Materia;

public profesores(String nombre, String apellidos, String direccion, String sexo, int añoNac, String nacionalidad,
		String materia) {
	super(nombre, apellidos, direccion, sexo, añoNac, nacionalidad);
	Materia = materia;
}

public String getMateria() {
	return Materia;
}

public void setMateria(String materia) {
	Materia = materia;
}

}
