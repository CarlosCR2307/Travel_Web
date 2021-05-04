package pe.edu.upc.controller;



import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;



import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;

import javax.inject.Named;


import pe.edu.upc.entity.Departamento;
import pe.edu.upc.entity.Provincia;
import pe.edu.upc.service.IDepartamentoService;
import pe.edu.upc.service.IProvinciaService;



@Named

@RequestScoped



public class ProvinciaController implements Serializable {



	private static final long serialVersionUID = 1L;

	

	@Inject

	private IProvinciaService pService;
	
	@Inject

	private IDepartamentoService dService;

	private Provincia provincia;
	private Departamento departamento;

	List<Provincia> listaProvincias;
	List<Departamento> listaDepartamentos;

	

	@PostConstruct

	public void init() {

		this.listaProvincias = new ArrayList<Provincia>();

		this.provincia = new Provincia();
		this.listaDepartamentos = new ArrayList<Departamento>();

		this.departamento = new Departamento();

		this.listar();
		this.listarProvincia();

	}

	

	public String nuevoProvincia() {

		this.setProvincia(new Provincia());

		return "provincia.xhtml";

	}

	

	public void insertar() {

		pService.insertar(provincia);

		limpiarProvincia();
		this.listarProvincia();

	}

	

	public void listar() {

		listaDepartamentos = dService.listar();

	}
	public void listarProvincia() {

		listaProvincias = pService.listar();

	}

	

	public void limpiarProvincia() {

		this.init();

	}

	

	public void eliminar(Provincia provincia) {

		pService.eliminar(provincia.getIdProvincia());

		this.listarProvincia();

	}
	public String goActualizar(Provincia provincia) {
		this.setProvincia(provincia);
		return "actualizarProvincia.xhtml";
	}
	
	public void actualizar() {
		try {
			pService.actualizar(provincia);
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



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}



	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}



	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}



	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}


}