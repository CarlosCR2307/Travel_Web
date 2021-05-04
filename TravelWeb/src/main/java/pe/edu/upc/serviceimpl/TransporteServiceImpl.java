package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITransporteDao;
import pe.edu.upc.entity.Transporte;
import pe.edu.upc.service.ITransporteService;

@Named
@RequestScoped

public class TransporteServiceImpl implements ITransporteService,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITransporteDao td;

	@Override
	public void insertar(Transporte transporte) {
		
		td.insertar(transporte);
	}

	@Override
	public List<Transporte> listar() {
		
		return td.listar();
	}

	@Override
	public void eliminar(int idTransporte) {
		td.eliminar(idTransporte);
		
	}
	@Override
	public void actualizar(Transporte transporte) {
		// TODO Auto-generated method stub
		md.actualizar(transporte);
	}
}
