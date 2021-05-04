package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Turista;

public interface ITuristaDao {
	public void insertar(Turista turista);
	public List<Turista> listar();
	public void eliminar(int idTurista);
	public void actualizar(Turista turista);
}
