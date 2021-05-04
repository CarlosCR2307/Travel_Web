package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.AlquilerAuto;

public interface IAlquilerAutoDao {
	public void insertar(AlquilerAuto alquilerAuto);
	public List<AlquilerAuto> listar();
	public void eliminar(int idAlquilerAuto);
	public void actualizar(AlquilerAuto alquilerAuto);
}
