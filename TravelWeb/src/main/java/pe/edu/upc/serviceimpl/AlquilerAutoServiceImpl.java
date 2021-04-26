package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlquilerAutoDao;
import pe.edu.upc.entity.AlquilerAuto;
import pe.edu.upc.service.IAlquilerAutoService;

@Named
@RequestScoped

public class AlquilerAutoServiceImpl implements IAlquilerAutoService,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlquilerAutoDao ad;

	@Override
	public void insertar(AlquilerAuto alquilerAuto) {
		
		ad.insertar(alquilerAuto);
	}

	@Override
	public List<AlquilerAuto> listar() {
		
		return ad.listar();
	}

	@Override
	public void eliminar(int idAlquilerAuto) {
		ad.eliminar(idAlquilerAuto);
		
	}

}
