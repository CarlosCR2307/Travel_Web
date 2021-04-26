package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transporte")
public class Comentario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTransporte;
	
	@Column(name="tipoTransporte",nullable=false,length=20)
	private String tipoTransporte;
	
	@Column(name="nameEmpresa",nullable=false,length=30)
	private String Empresa;
	
	@Column(name="precioTransporte",nullable=false)
	private int precio;

	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentario(int idTransporte, String tipoTransporte, String empresa, int precio) {
		super();
		this.idTransporte = idTransporte;
		this.tipoTransporte = tipoTransporte;
		Empresa = empresa;
		this.precio = precio;
	}

	public int getIdTransporte() {
		return idTransporte;
	}

	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
