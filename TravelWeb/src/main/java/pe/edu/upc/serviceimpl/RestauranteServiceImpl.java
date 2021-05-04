package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRestauranteDao;
import pe.edu.upc.entity.Restaurante;
import pe.edu.upc.service.IRestauranteService;

@Named
@RequestScoped

public class RestauranteServiceImpl implements IRestauranteService,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRestauranteDao rd;

	@Override
	public void insertar(Restaurante restaurante) {
		// TODO Auto-generated method stub
		rd.insertar(restaurante);
	}

	@Override
	public List<Restaurante> listar() {
		// TODO Auto-generated method stub
		return rd.listar();
	}

	@Override
	public void eliminar(int idRestaurante) {
		// TODO Auto-generated method stub
		rd.eliminar(idRestaurante);
	}
	
	
	@Override
	public void actualizar(Restaurante restaurante) {
		// TODO Auto-generated method stub
		rd.actualizar(restaurante);
	}

}
