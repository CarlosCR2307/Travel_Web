package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Transporte;

public interface ITransporteDao {
	public void insertar(Transporte transporte);
	public List<Transporte> listar();
	public void eliminar(int idTransporte);

}
