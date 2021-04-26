package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Turista;

public interface ITuristaService {
	public void insertar(Turista turista);
	public List<Turista> listar();
	public void eliminar(int idTurista);


}
