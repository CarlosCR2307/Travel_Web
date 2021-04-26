package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.AlquilerAuto;
import pe.edu.upc.service.IAlquilerAutoService;

@Named
@RequestScoped

public class AlquilerAutoController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlquilerAutoService aService;
	
	private AlquilerAuto alquilerAuto;
	List<AlquilerAuto> listaAlquilerAutos;
	
	@PostConstruct
	public void init() {
		this.listaAlquilerAutos=new ArrayList<AlquilerAuto>();
		this.alquilerAuto=new AlquilerAuto();
		this.listar();
	}
	
	public String nuevoAlquilerAuto() {
		this.setAlquilerAuto(new AlquilerAuto());
		return "auto.xhtml";
	}
	public void insertar() {
		aService.insertar(alquilerAuto);
		limpiarAlquilerAuto();
	}
	public void listar() {
		listaAlquilerAutos=aService.listar();
	}
	public void limpiarAlquilerAuto() {
		this.init();
	}
	public void eliminar(AlquilerAuto alquilerAuto) {
		aService.eliminar(alquilerAuto.getIdAlquilerAuto());
		this.listar();
	}

	public IAlquilerAutoService getaService() {
		return aService;
	}

	public void setaService(IAlquilerAutoService aService) {
		this.aService = aService;
	}

	public AlquilerAuto getAlquilerAuto() {
		return alquilerAuto;
	}

	public void setAlquilerAuto(AlquilerAuto alquilerAuto) {
		this.alquilerAuto = alquilerAuto;
	}

	public List<AlquilerAuto> getListaAlquilerAutos() {
		return listaAlquilerAutos;
	}

	public void setListaAlquilerAutos(List<AlquilerAuto> listaAlquilerAutos) {
		this.listaAlquilerAutos = listaAlquilerAutos;
	}

	
}
