package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Hotel;
import pe.edu.upc.service.IHotelService;

@Named
@RequestScoped

public class HotelController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHotelService hService;
	private Hotel hotel;
	List<Hotel> listaHoteles;
	
	@PostConstruct
	public void init() {
		this.listaHoteles=new ArrayList<Hotel>();
		this.hotel=new Hotel();
		this.listar();
	}
	
	public String nuevoHotel() {
		this.setHotel(new Hotel());
		return "hotel.xhtml";
	}
	public void insertar() {
		hService.insertar(hotel);
		limpiarHotel();
	}
	public void listar() {
		listaHoteles=hService.listar();
	}
	public void limpiarHotel() {
		this.init();
	}
	public void eliminar(Hotel hotel) {
		hService.eliminar(hotel.getIdHotel());
		this.listar();
	}
	
	
	
	public String goActualizar(Hotel hotel) {
		this.setHotel(hotel);
		return "actualizarHotel.xhtml";
	}
	
	public void actualizar() {
		try {
			hService.actualizar(hotel);
			this.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Hotel> getListaHoteles() {
		return listaHoteles;
	}

	public void setListaHoteles(List<Hotel> listaHoteles) {
		this.listaHoteles = listaHoteles;
	}	
	

}
