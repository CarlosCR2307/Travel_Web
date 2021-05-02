package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Restaurante;

public interface IRestauranteDao {
	public void insertar(Restaurante restaurante);
	public List<Restaurante> listar();
	public void eliminar(int idRestaurante);
	public void actualizar(Restaurante restaurante);
}
