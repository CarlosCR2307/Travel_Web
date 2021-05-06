package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReservaViajeDao;
import pe.edu.upc.entity.ReservaViaje;
import pe.edu.upc.service.IReservaViajeService;

@Named
@RequestScoped

public class ReservaViajeServiceImpl implements IReservaViajeService,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IReservaViajeDao ad;

	@Override
	public void insertar(ReservaViaje reservaViaje) {
		
		ad.insertar(reservaViaje);
	}

	@Override
	public List<ReservaViaje> listar() {
		
		return ad.listar();
	}

	@Override
	public void eliminar(int idReservaViaje) {
		ad.eliminar(idReservaViaje);
		
	}

	@Override
	public void actualizar(ReservaViaje reservaViaje) {
		
		ad.actualizar(reservaViaje);
	}
}
