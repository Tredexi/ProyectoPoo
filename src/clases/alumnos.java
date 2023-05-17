package clases;

public class alumnos extends Persona {
public String Tutor; 
public String TelTutor;
public alumnos(String nombre, String apellidos, String direccion, String sexo, int añoNac, String nacionalidad,
		String tutor, String telTutor) {
	super(nombre, apellidos, direccion, sexo, añoNac, nacionalidad);
	Tutor = tutor;
	TelTutor = telTutor;
}
public String getTutor() {
	return Tutor;
}
public void setTutor(String tutor) {
	Tutor = tutor;
}
public String getTelTutor() {
	return TelTutor;
}
public void setTelTutor(String telTutor) {
	TelTutor = telTutor;
}

}
