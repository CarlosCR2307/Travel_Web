package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Hotel;

public interface IHotelService {
	public void insertar(Hotel hotel);
	public List<Hotel> listar();
	public void eliminar(int idHotel);
	public void actualizar(Hotel hotel);
}
