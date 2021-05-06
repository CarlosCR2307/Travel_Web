package pe.edu.upc.controller;



import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;



import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;

import javax.inject.Named;


import pe.edu.upc.entity.ReservaViaje;
import pe.edu.upc.entity.Provincia;
import pe.edu.upc.service.IReservaViajeService;
import pe.edu.upc.service.IProvinciaService;
import pe.edu.upc.entity.Transporte;
import pe.edu.upc.service.ITransporteService;
import pe.edu.upc.entity.Restaurante;
import pe.edu.upc.service.IRestauranteService;
import pe.edu.upc.entity.Hotel;
import pe.edu.upc.service.IHotelService;
import pe.edu.upc.entity.AlquilerAuto;
import pe.edu.upc.service.IAlquilerAutoService;
import pe.edu.upc.entity.Turista;
import pe.edu.upc.service.ITuristaService;

@Named

@RequestScoped



public class ReservaViajeController implements Serializable {



	private static final long serialVersionUID = 1L;

	

	@Inject

	private IProvinciaService pService;
	
	@Inject
    private IHotelService hService;
	
	@Inject
    private ITransporteService tService;
	
	@Inject
    private IRestauranteService rService;
	
	@Inject
    private IAlquilerAutoService aService;
	
	@Inject
    private ITuristaService tuService;
	
	@Inject
    private IReservaViajeService rvService;
	
	

	private Provincia provincia;
	private Transporte transporte;
	private Restaurante restaurante;
	private Hotel hotel;
	private Turista turista;
	private AlquilerAuto alquilerAuto;
	private ReservaViaje reservaviaje;

	List<Provincia> listaProvincias;
	List<Transporte> listaTransportes;
	List<Restaurante> listaRestaurantes;
	List<Hotel> listaHoteles;
	List<Turista> listaTuristas;
	List<AlquilerAuto> listaAlquilerAutos;
	List<ReservaViaje> listaReservaViajes;

	

	@PostConstruct

	public void init() {

		this.listaProvincias = new ArrayList<Provincia>();
		this.provincia = new Provincia();
		
		this.listaTransportes = new ArrayList<Transporte>();
        this.transporte = new Transporte();
        
        this.listaRestaurantes = new ArrayList<Restaurante>();
        this.restaurante = new Restaurante();
        
        this.listaHoteles = new ArrayList<Hotel>();
        this.hotel = new Hotel();
        
        this.listaTuristas = new ArrayList<Turista>();
        this.turista = new Turista();
        
        this.listaAlquilerAutos = new ArrayList<AlquilerAuto>();
        this.alquilerAuto = new AlquilerAuto();
        
        this.listaReservaViajes = new ArrayList<ReservaViaje>();
        this.reservaviaje = new ReservaViaje();

		this.listar();
		this.listarReservaViaje();

	}

	

	public String nuevoReservaViaje() {

		this.setReservaviaje(new ReservaViaje());

		return "reservarviaje.xhtml";

	}

	

	public void insertar() {

		rvService.insertar(reservaviaje);

		limpiarReservaViaje();
		this.listarReservaViaje();

	}

	

	public void listar() {

		listaProvincias = pService.listar();
		listaTransportes = tService.listar();
		listaRestaurantes = rService.listar();
		listaHoteles = hService.listar();
		listaTuristas=tuService.listar();
		listaAlquilerAutos = aService.listar();

	}
	public void listarReservaViaje() {

		listaReservaViajes = rvService.listar();

	}

	

	public void limpiarReservaViaje() {

		this.init();

	}

	

	public void eliminar(ReservaViaje reservaviaje) {

		rvService.eliminar(reservaviaje.getIdReservaViaje());

		this.listarReservaViaje();

	}
	public String goActualizar(ReservaViaje reservaviaje) {
		this.setReservaviaje(reservaviaje);
		return "actualizarReservaViaje.xhtml";
	}
	
	public void actualizar() {
		try {
			rvService.actualizar(reservaviaje);
			this.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	public Provincia getProvincia() {
		return provincia;
	}



	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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



	public Turista getTurista() {
		return turista;
	}



	public void setTurista(Turista turista) {
		this.turista = turista;
	}



	public AlquilerAuto getAlquilerAuto() {
		return alquilerAuto;
	}



	public void setAlquilerAuto(AlquilerAuto alquilerAuto) {
		this.alquilerAuto = alquilerAuto;
	}



	public ReservaViaje getReservaviaje() {
		return reservaviaje;
	}



	public void setReservaviaje(ReservaViaje reservaviaje) {
		this.reservaviaje = reservaviaje;
	}



	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}



	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}



	public List<Transporte> getListaTransportes() {
		return listaTransportes;
	}



	public void setListaTransportes(List<Transporte> listaTransportes) {
		this.listaTransportes = listaTransportes;
	}



	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}



	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}



	public List<Hotel> getListaHoteles() {
		return listaHoteles;
	}



	public void setListaHoteles(List<Hotel> listaHoteles) {
		this.listaHoteles = listaHoteles;
	}



	public List<Turista> getListaTuristas() {
		return listaTuristas;
	}



	public void setListaTuristas(List<Turista> listaTuristas) {
		this.listaTuristas = listaTuristas;
	}



	public List<AlquilerAuto> getListaAlquilerAutos() {
		return listaAlquilerAutos;
	}



	public void setListaAlquilerAutos(List<AlquilerAuto> listaAlquilerAutos) {
		this.listaAlquilerAutos = listaAlquilerAutos;
	}



	public List<ReservaViaje> getListaReservaViajes() {
		return listaReservaViajes;
	}



	public void setListaReservaViajes(List<ReservaViaje> listaReservaViajes) {
		this.listaReservaViajes = listaReservaViajes;
	}

	
}