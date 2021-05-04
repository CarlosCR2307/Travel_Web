package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.AlquilerAuto;
import pe.edu.upc.entity.Departamento;

public interface IAlquilerAutoService {
	public void insertar(AlquilerAuto alquilerAuto);
	public List<AlquilerAuto> listar();
	public void eliminar(int idAlquilerAuto);
	public void actualizar(AlquilerAuto alquilerAuto);
}
