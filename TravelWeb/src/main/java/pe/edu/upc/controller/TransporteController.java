package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Transporte;
import pe.edu.upc.service.ITransporteService;

@Named
@RequestScoped

public class TransporteController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITransporteService tService;
	
	private Transporte transporte;
	List<Transporte> listaTransportes;
	
	@PostConstruct
	public void init() {
		this.listaTransportes=new ArrayList<Transporte>();
		this.transporte=new Transporte();
		this.listar();
	}
	
	public String nuevoTransporte() {
		this.setTransporte(new Transporte());
		return "transporte.xhtml";
	}
	public void insertar() {
		tService.insertar(transporte);
		limpiarTransporte();
	}
	public void listar() {
		listaTransportes=tService.listar();
	}
	public void limpiarTransporte() {
		this.init();
	}
	public void eliminar(Transporte transporte) {
		tService.eliminar(transporte.getIdTransporte());
		this.listar();
	}
	
	public String goActualizar(Transporte transporte) {
		this.setTransporte(transporte);
		return "actualizarTransporte.xhtml";
	}
	
	public void actualizar() {
		try {
			dService.actualizar(transporte);
			this.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public List<Transporte> getListaTransportes() {
		return listaTransportes;
	}

	public void setListaTransportes(List<Transporte> listaTransportes) {
		this.listaTransportes = listaTransportes;
	}	
	

}
