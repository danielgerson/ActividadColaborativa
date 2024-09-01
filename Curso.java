package prograColaborativo;

	//Curso.java
	public class Curso {
		private String nombreCurso;

 // Constructor
	public Curso(String nombreCurso) {
     this.nombreCurso = nombreCurso;
 }

 // Getter y Setter
	public String getNombreCurso() {
     return nombreCurso;
 }

	public void setNombreCurso(String nombreCurso) {
     this.nombreCurso = nombreCurso;
 }

	@Override
	public String toString() {
     return "Curso: " + nombreCurso;
 }
}
