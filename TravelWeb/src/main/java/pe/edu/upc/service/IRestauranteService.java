package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Restaurante;

public interface IRestauranteService {
	public void insertar(Restaurante restaurante);
	public List<Restaurante> listar();
	public void eliminar(int idRestaurante);

}
