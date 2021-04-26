package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="turista")
public class Turista implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTurista;
	
	@Column(name="nameTurista",nullable=false,length=20)
	private String nombreTurista;
	
	@Column(name="lastnameTurista",nullable=false,length=30)
	private String ApellidoTurista;
	
	@Column(name="dniTurista",nullable=false, length=8)
	private int dni;
	
	@Column(name="telefonoTurista",nullable=false, length=9)
	private int telefono;

	public Turista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Turista(int idTurista, String nombreTurista, String apellidoTurista, int dni, int telefono) {
		super();
		this.idTurista = idTurista;
		this.nombreTurista = nombreTurista;
		ApellidoTurista = apellidoTurista;
		this.dni = dni;
		this.telefono= telefono;
	}

	public int getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(int idTurista) {
		this.idTurista = idTurista;
	}

	public String getNombreTurista() {
		return nombreTurista;
	}

	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}

	public String getApellidoTurista() {
		return ApellidoTurista;
	}

	public void setApellidoTurista(String apellidoTurista) {
		ApellidoTurista = apellidoTurista;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
}
