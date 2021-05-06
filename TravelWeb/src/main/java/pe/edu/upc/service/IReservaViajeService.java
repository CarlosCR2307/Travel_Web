package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ReservaViaje;

public interface IReservaViajeService {
	public void insertar(ReservaViaje reservaViaje);
	public List<ReservaViaje> listar();
	public void eliminar(int idReservaViaje);
	public void actualizar(ReservaViaje reservaViaje);
}
