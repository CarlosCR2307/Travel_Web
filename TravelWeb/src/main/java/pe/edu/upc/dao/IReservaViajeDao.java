package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ReservaViaje;

public interface IReservaViajeDao {
	public void insertar(ReservaViaje reservaViaje);
	public List<ReservaViaje> listar();
	public void eliminar(int idReservaViaje);
	public void actualizar(ReservaViaje reservaViaje);
}
