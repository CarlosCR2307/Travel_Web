package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ReservaViaje")
public class ReservaViaje implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReservaViaje;
	
	@ManyToOne
	@JoinColumn(name="idTransporte",nullable=false)
	private Transporte transporte; 
	
	@ManyToOne
	@JoinColumn(name="idRestaurante",nullable=false)
	private Restaurante restaurante;
	
	@ManyToOne
	@JoinColumn(name="idHotel",nullable=false)
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name="idProvincia",nullable=false)
	private Provincia provincia;
	
	@ManyToOne
	@JoinColumn(name="idAlquilerAuto",nullable=false)
	private AlquilerAuto auto;
	
	
	public ReservaViaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservaViaje(int idReservaViaje, Transporte transporte, Restaurante restaurante, Hotel hotel,
			Provincia provincia, AlquilerAuto auto) {
		super();
		this.idReservaViaje = idReservaViaje;
		this.transporte = transporte;
		this.restaurante = restaurante;
		this.hotel = hotel;
		this.provincia = provincia;
		this.auto = auto;
	}

	public int getIdReservaViaje() {
		return idReservaViaje;
	}

	public void setIdReservaViaje(int idReservaViaje) {
		this.idReservaViaje = idReservaViaje;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public AlquilerAuto getAuto() {
		return auto;
	}

	public void setAuto(AlquilerAuto auto) {
		this.auto = auto;
	}


	
}
