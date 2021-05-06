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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ApellidoTurista == null) ? 0 : ApellidoTurista.hashCode());
		result = prime * result + dni;
		result = prime * result + idTurista;
		result = prime * result + ((nombreTurista == null) ? 0 : nombreTurista.hashCode());
		result = prime * result + telefono;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turista other = (Turista) obj;
		if (ApellidoTurista == null) {
			if (other.ApellidoTurista != null)
				return false;
		} else if (!ApellidoTurista.equals(other.ApellidoTurista))
			return false;
		if (dni != other.dni)
			return false;
		if (idTurista != other.idTurista)
			return false;
		if (nombreTurista == null) {
			if (other.nombreTurista != null)
				return false;
		} else if (!nombreTurista.equals(other.nombreTurista))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}
	

	
}
