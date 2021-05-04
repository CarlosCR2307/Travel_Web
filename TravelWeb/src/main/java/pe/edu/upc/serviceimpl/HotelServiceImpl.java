package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHotelDao;
import pe.edu.upc.entity.Hotel;
import pe.edu.upc.service.IHotelService;

@Named
@RequestScoped

public class HotelServiceImpl implements IHotelService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHotelDao hd;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		hd.insertar(hotel);
	}

	@Override
	public List<Hotel> listar() {
		// TODO Auto-generated method stub
		return hd.listar();
	}

	@Override
	public void eliminar(int idHotel) {
		// TODO Auto-generated method stub
		hd.eliminar(idHotel);
	}
	
	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		hd.actualizar(hotel);
	}

}
