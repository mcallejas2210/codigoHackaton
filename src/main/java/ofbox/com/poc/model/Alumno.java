package ofbox.com.poc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator="|")
public class Alumno {
	
	@DataField(pos = 1)
	private String nombre;
	
	@DataField(pos = 2)
	private String a_Paterno;
	
	@DataField(pos = 3)
	private String a_Materno;

	@DataField(pos = 4)
	private String edad;
	
	@DataField(pos = 5)
	private String carrera;
	
	@DataField(pos = 6)
	private String semestre;
	
	@DataField(pos = 7)
	private String tutor;
	
	@DataField(pos = 8)
	private double promedio;
	
	@DataField(pos = 9)
	private String creditos_aprobados;
	
	@DataField(pos = 10)
	private String materias_reprobadas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getA_Paterno() {
		return a_Paterno;
	}

	public void setA_Paterno(String a_Paterno) {
		this.a_Paterno = a_Paterno;
	}

	public String getA_Materno() {
		return a_Materno;
	}

	public void setA_Materno(String a_Materno) {
		this.a_Materno = a_Materno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public String getCreditos_aprobados() {
		return creditos_aprobados;
	}

	public void setCreditos_aprobados(String creditos_aprobados) {
		this.creditos_aprobados = creditos_aprobados;
	}

	public String getMaterias_reprobadas() {
		return materias_reprobadas;
	}

	public void setMaterias_reprobadas(String materias_reprobadas) {
		this.materias_reprobadas = materias_reprobadas;
	}
	
	
}
