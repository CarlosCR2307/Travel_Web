package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.entity.Hotel;

public interface IHotelDao {
	public void insertar(Hotel hotel);
	public List<Hotel> listar();
	public void eliminar(int idHotel);
	public void actualizar(Hotel hotel);

}
