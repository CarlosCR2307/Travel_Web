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

	
	
	
}
