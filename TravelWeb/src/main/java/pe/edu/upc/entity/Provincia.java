package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProvincia;
	
	@Column(name="nombreProvincia", nullable=false, length=30)
	private String nombreProvincia;
	
	@ManyToOne
	@JoinColumn(name="idDepartamento",nullable=false)
	private Departamento departamento;

	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provincia(int idProvincia, String nombreProvincia, Departamento departamento) {
		super();
		this.idProvincia = idProvincia;
		this.nombreProvincia = nombreProvincia;
		this.departamento = departamento;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	
	

	

}
