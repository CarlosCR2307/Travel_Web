package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alquilerauto")
public class AlquilerAuto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlquilerAuto;
	
	@Column(name="modeloAuto",nullable=false,length=20)
	private String modeloAuto;
	
	@Column(name="precioAlquilerAuto",nullable=false)
	private int precio;

	public AlquilerAuto() {
		super();
	}

	public AlquilerAuto(int idAlquilerAuto, String modeloAuto, int precio) {
		super();
		this.idAlquilerAuto = idAlquilerAuto;
		this.modeloAuto = modeloAuto;
		this.precio = precio;
	}

	public int getIdAlquilerAuto() {
		return idAlquilerAuto;
	}

	public void setIdAlquilerAuto(int idAlquilerAuto) {
		this.idAlquilerAuto = idAlquilerAuto;
	}

	public String getModeloAuto() {
		return modeloAuto;
	}

	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAlquilerAuto;
		result = prime * result + ((modeloAuto == null) ? 0 : modeloAuto.hashCode());
		result = prime * result + precio;
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
		AlquilerAuto other = (AlquilerAuto) obj;
		if (idAlquilerAuto != other.idAlquilerAuto)
			return false;
		if (modeloAuto == null) {
			if (other.modeloAuto != null)
				return false;
		} else if (!modeloAuto.equals(other.modeloAuto))
			return false;
		if (precio != other.precio)
			return false;
		return true;
	}

	
	
	
}
