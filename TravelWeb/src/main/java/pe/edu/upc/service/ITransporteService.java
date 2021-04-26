package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Transporte;

public interface ITransporteService {
	public void insertar(Transporte transporte);
	public List<Transporte> listar();
	public void eliminar(int idTransporte);


}
