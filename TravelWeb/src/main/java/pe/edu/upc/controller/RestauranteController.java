package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Restaurante;
import pe.edu.upc.service.IRestauranteService;

@Named
@RequestScoped

public class RestauranteController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRestauranteService rService;
	private Restaurante restaurante;
	List<Restaurante> listaRestaurantes;
	
	@PostConstruct
	public void init() {
		this.listaRestaurantes=new ArrayList<Restaurante>();
		this.restaurante=new Restaurante();
		this.listar();
	}
	
	public String nuevoRestaurante() {
		this.setRestaurante(new Restaurante());
		return "restaurante.xhtml";
	}
	public void insertar() {
		rService.insertar(restaurante);
		limpiarRestaurante();
	}
	public void listar() {
		listaRestaurantes=rService.listar();
	}
	public void limpiarRestaurante() {
		this.init();
	}
	public void eliminar(Restaurante restaurante) {
		rService.eliminar(restaurante.getIdRestaurante());
		this.listar();
	}
	
	
	public String goActualizar(Restaurante restaurante) {
		this.setRestaurante(restaurante);
		return "actualizarRestaurante.xhtml";
	}
	
	public void actualizar() {
		try {
			rService.actualizar(restaurante);
			this.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public List<Restaurante> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public void setListaRestaurantes(List<Restaurante> listaRestaurantes) {
		this.listaRestaurantes = listaRestaurantes;
	}	

}
